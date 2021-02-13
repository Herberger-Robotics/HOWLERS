package org.firstinspires.ftc.teamcode.subsystems.Intake;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.hardwaremaps.HowlersHardware;
import org.firstinspires.ftc.teamcode.hardwaremaps.motors.HowlersMotor;
import org.firstinspires.ftc.teamcode.subsystems.subsystem;

public class Intake extends subsystem {
    public boolean busy;

    public Intake(final HardwareMap hwMap) {
        HowlersHardware robot = HowlersHardware.getInstance();
        robot.intakeMotor = new HowlersMotor(hwMap, "intakeMotor", 134.4);
    }

    public void stop() {
        HowlersHardware robot = HowlersHardware.getInstance();
        robot.intakeMotor.set(0);
    }
}
