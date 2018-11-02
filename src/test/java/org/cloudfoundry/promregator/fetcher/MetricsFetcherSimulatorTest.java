package org.cloudfoundry.promregator.fetcher;

import java.util.HashMap;

import org.cloudfoundry.promregator.JUnitTestUtils;
import org.cloudfoundry.promregator.auth.NullEnricher;
import org.cloudfoundry.promregator.endpoint.UpMetric;
import org.cloudfoundry.promregator.rewrite.AbstractMetricFamilySamplesEnricher;
import org.cloudfoundry.promregator.rewrite.CFAllLabelsMetricFamilySamplesEnricher;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import io.prometheus.client.Collector.MetricFamilySamples;
import io.prometheus.client.Gauge;

public class MetricsFetcherSimulatorTest {
	@AfterClass
	public static void cleanUp() {
		JUnitTestUtils.cleanUpAll();
	}

	@Test
	public void testCall() throws Exception {
		Gauge up = Gauge.build("up_test", "help test").create();
		UpMetric upm = new UpMetric(up);
		
		AbstractMetricFamilySamplesEnricher mfse = new CFAllLabelsMetricFamilySamplesEnricher("testOrgName", "testSpaceName", "testapp", "testinstance1");
		MetricsFetcherSimulator subject = new MetricsFetcherSimulator("accessUrl", 
				new NullEnricher(), mfse , 
				Mockito.mock(MetricsFetcherMetrics.class), upm);
		
		HashMap<String, MetricFamilySamples> result = subject.call();
		
		Assert.assertEquals(3, result.size());
	}

}
