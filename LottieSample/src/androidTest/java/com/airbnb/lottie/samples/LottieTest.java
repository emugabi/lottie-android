package com.airbnb.lottie.samples;


import android.test.ActivityInstrumentationTestCase2;

import org.junit.Test;

/**
 * Run these with: ./gradlew --daemon recordMode screenshotTests
 * If you run that command, it completes successfully, and nothing shows up in git, then you haven't broken anything!
 */
public class LottieTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public LottieTest() {
        super(MainActivity.class);
    }

    @Test
    public void testAll() {
        TestRobot.testAnimation(getActivity(), "9squares-AlBoardman.json");
        TestRobot.testAnimation(getActivity(), "EmptyState.json");
        TestRobot.testAnimation(getActivity(), "HamburgerArrow.json");
        TestRobot.testAnimation(getActivity(), "LottieLogo1.json");
        TestRobot.testAnimation(getActivity(), "LottieLogo2.json");
        TestRobot.testAnimation(getActivity(), "MotionCorpse-Jrcanest.json");
        TestRobot.testAnimation(getActivity(), "PinJump.json");
        TestRobot.testAnimation(getActivity(), "TwitterHeart.json");
        TestRobot.testAnimation(getActivity(), "Tests/Hosts.json");
        TestRobot.testAnimation(getActivity(), "Tests/LightBulb.json", new float[] {0f, 0.05f, 0.10f, 0.2f, 0.3f, 0.4f, 0.5f, 1f});
        TestRobot.testAnimation(getActivity(), "Tests/LoopPlayOnce.json");
        TestRobot.testAnimation(getActivity(), "Tests/Alarm.json");
        TestRobot.testAnimation(getActivity(), "Tests/CheckSwitch.json");
    }
}
