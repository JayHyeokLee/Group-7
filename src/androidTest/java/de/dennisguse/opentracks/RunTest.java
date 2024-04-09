package de.dennisguse.opentracks;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.GrantPermissionRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import de.dennisguse.opentracks.data.models.Altitude;
import de.dennisguse.opentracks.data.models.Run;
import de.dennisguse.opentracks.data.models.TrackPoint;

@RunWith(AndroidJUnit4.class)
public class RunTest {

    @Test
    public void calculateRunSpecificElevationGainTest()
    {
        Run run = new Run();
        List<TrackPoint> trackpoints = new ArrayList<TrackPoint>();
        trackpoints.add(new TrackPoint(20, 40, new Altitude(650), 20));
        trackpoints.add(new TrackPoint(40, 60, new Altitude(650), 20));
        trackpoints.add(new TrackPoint(70, 80, new Altitude(650), 20));
        trackpoints.add(new TrackPoint(80, 40, new Altitude(650), 20));
        run.setTrackPointsList(trackpoints);

        run.calculateRunSpecificElevationGain();
    }
}
