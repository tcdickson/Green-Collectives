package com.example.greensociety;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;


public class BasicDrillController extends HomeApplication{

    @FXML
    VBox drillVBox;

    public TextArea getTextArea() {
        return textArea;
    }
    @FXML
    TextArea textArea;
    public static final String BASIC_DRILL = """
            Basic Drill: One and Two Shots with a Scan

            Target: 6-inch circle or VTAC

            Distance: 3 to 10 yards for pistol; 10 to 20 yards for rifle

            Rounds: 15 rounds for pistol; 30 rounds for rifle

            Start Position: Low-ready, high-ready, or from holster

            Shooter will take one or two shots at a target, maintain one’s sight picture on target after the shot for proper follow-through, then the shooter will end the drill by scanning and assessing.\s
            """;

    public static final String SINGLE_SHOT_SCAN = """
            Single Shot with a Scan from the Holster

            Target: 6-inch circle or VTAC

            Distance: 3 to 10 yards

            Rounds: 15 rounds for pistol; 30 rounds for rifle

            Start Position: Holster

            Score:
            
            Beginner: > 2.5 seconds\s
                • Intermediate: 1 to 2.5 seconds\s
                • Advanced: < 1 second\s
            From the holster or on the signal, shooter will draw and take one shot at a target, maintain sight picture on target after the shot for proper follow-through, shooter ends drill by scanning and assessing.\s""";
    public static final String IMMEDIATE_ACTION = """
            Immediate Action Drill

            Target: 6-inch circle or VTAC

            Distance: 3 - 10 yards for pistol; 10 - 20 yards for rifle

            Rounds: Load entire magazine with at least three dummy rounds randomly loaded into the magazine. Dummy rounds should not be the first or last round in the magazine, and dummy rounds should not be loaded one after the other.

            Start Position: Holster

            From the holster or on the signal, shooter will draw and take one shot at a target, maintain sight picture on target after the shot for proper follow-through, shooter ends drill by scanning and assessing.\s""";
    public static final String ONE_RELOAD_ONE = """
            1-Reload-1

            Target: 6-inch circle or VTAC

            Distance: 5 yards for pistol; 10 yards for rifle

            Rounds: 30 rounds for pistol

            Start Position: Pistols: Holster Rifles: low or high ready

            Score:

                Pistol
                    Beginner: Greater than 5 seconds
                    Intermediate: 3 to 5 seconds
                    Advanced: Less than 3 seconds
                Rifle
                    Beginner: Greater than 6 seconds
                    Intermediate: 4 to 6 seconds
                    Advanced: Less than 4 seconds

            From the holster or upon a signal, the shooter will draw and fire one shot at the target. They must maintain their sight picture on the target after the shot for proper follow-through. The drill concludes with the shooter scanning and assessing the situation.
            Start with a single round in your weapon's chamber and a full magazine in your magazine pouch.
            For pistols, draw from the holster or the low or high-ready position if using a rifle. Fire one shot until the slide locks back. Perform a magazine change and re-engage the target. Afterward, conduct a tactical reload using both hands, and you can repeat the drill.
            As you become more proficient, consider reducing the size of your target and/or increasing the distance to the target. Optionally, introduce a timer to add stress to the exercise.""";
    public static final String ONE_RELOAD_ONE_STRONG_S = """
            1-Reload-1: Strong Side

            Target: 6-inch circle or VTAC

            Distance:\s
            Pistol: 5 yards; Rifle: 10 yards

            Rounds: 30 rounds for pistol

            Start Position: Holster\s

            Start with a magazine with one round in your pistol and a full magazine in a magazine pouch.

            Draw your weapon from the holster using your strong hand only and fire one shot until the slide locks back. Follow this with a strong-hand-only magazine change and re-engage your target. After completion, perform a tactical reload using both hands before repeating the drill.
            
            As you gain confidence, consider reducing the target size and/or increasing the target distance. For added challenge, introduce a timer to add stress to the exercise.""";
    public static final String ONE_RELOAD_ONE_SUPPORT_S = """
            1-Reload-1: Support Side

            Target: 6-inch circle or VTAC

            Distance:\s
            Pistol: 5 yards; Rifle: 10 yards

            Rounds: 30 rounds for pistol

            Start Position: Holster\s

            Start with a magazine with one round in your pistol and a full magazine in a magazine pouch.

            Draw your weapon from the holster using your support hand only and fire one shot until the slide locks back. Follow this with a strong-hand-only magazine change and re-engage your target. After completion, perform a tactical reload using both hands before repeating the drill.
            
            As you become more proficient, consider reducing the target size and/or increasing the target distance. Introduce a timer for added stress during the drill.""";
    public static final String TWO_SHOTS_SCAN_HOLSTER = """
            2-Shots with a Scan from the Holster

            Target: 6-inch circle or VTAC

            Distance:\s
            Pistol: 3 to 10 yards

            Rounds: 30 rounds for pistol

            Start Position: Holster

            Score:
            
            Beginner: > 2.5 seconds\s
                • Intermediate: 1 to 2.5 seconds\s
                • Advanced: < 1.5 second\s
                
            From the holster or on the signal, shooter will draw and take two shots at a target, maintain sight picture on target after the shot for proper follow-through, shooter ends drill by scanning and assessing.""";
    public static final String TWO_SHOTS_SCAN_RIGHT_SHOULDER = """
            2-Shots with a Scan from the Holster (Right Shoulder)

            Target: 6-inch circle or VTAC

            Distance: 3 to 10 yards

            Rounds: 30 rounds for pistol

            Start Position: Holster

            Score:
            
            Beginners: < 4 seconds\s
            Intermediate: < 3 seconds\s
            Advanced: < 2 seconds\s
            
            This is a simple drill to start moving and shooting. Have your right shoulder facing the target. Pistol in holster.
            
            On the signal, you will turn to face your target and engage the target with two shots, center mass. You can change the number of shots and placements of the shots to vary things up.\s
            Maintain muzzle awareness at all times.\s""";
    public static final String TWO_SHOTS_SCAN_LEFT_SHOULDER = """
            2-Shots with a Scan from the Holster (Left Shoulder)

            Target: 6-inch circle or VTAC

            Distance: 3 to 10 yards

            Rounds: 30 rounds for pistol

            Start Position: Holster

            Score:
            
            Beginners: < 4 seconds\s
            Intermediate: < 3 seconds\s
            Advanced: < 2 seconds\s
            
            This is a simple drill to start moving and shooting. Have your left shoulder facing the target. Pistol in holster.
            
            On the signal, you will turn to face your target and engage the target with two shots, center mass. You can change the number of shots and placements of the shots to vary things up.\s
            Maintain muzzle awareness at all times.\s""";
    public static final String TWO_SHOTS_SCAN_BACK = """
            2-Shots with a Scan from the Holster (Back to Target)

            Target: 6-inch circle or VTAC

            Distance: 3 to 10 yards

            Rounds: 30 rounds for pistol

            Start Position: Holster

            Score:\s
            
            Beginners: < 4 seconds\s
            Intermediate: < 3 seconds\s
            Advanced: < 2 seconds\s
            
            This is a simple drill to start moving and shooting. Have your back facing the target. Pistol in holster.
            
            On the signal, you will turn to face your target and engage the target with two shots, center mass. You can change the number of shots and placements of the shots to vary things up.\s
            Maintain muzzle awareness at all times.""";
    public static final String BRASS_FRONT_SIGHT = """
            Brass on the Front Sight

            Practice trigger control with a basic dry fire exercise. Balance a spent brass casing or a coin on the front sight of your pistol. When you pull the trigger, focus on keeping the brass casing or coin in place, ensuring it doesn't fall off. This exercise hones your trigger press for improved accuracy.""";
    public static final String PENCIL_DRILL = """
            Pencil Drill

            This drill teaches the concept of a straight trigger press. It's a straightforward exercise that doesn't require a firearm; just grab a pencil.\s
            
            Position the pencil between your thumb and trigger finger, with the eraser touching your trigger finger. Your goal is to press the trigger straight to the rear while using the pencil to ensure proper alignment.""";
    public static final String TRIGGER_PREP = """
            Trigger Prep / Slack Out

            Start Position: Weapon pushed out to full presentation, weapon on target

            To improve accuracy and trigger control, it’s a good idea for beginners to take all of the slack out when preparing to take a shot. This can help minimize any unwanted movement from one’s trigger press.""";
    public static final String BALL_DUMMY = """
            Ball and Dummy

            Target: 6-inch circle or VTAC

            Distance:\s
            Pistol: 3 to 10 yards
            Rifle: 10 to 25 yards

            Rounds: 30 live rounds, mixed with dummy rounds

            Start Position: High or low ready position

            This drill enhances accuracy by addressing recoil anticipation and trigger jerking. You'll need dummy rounds and a partner. Your partner will load your magazine with a mix of live and dummy rounds (two-thirds live, one-third dummy), ensuring no consecutive dummy rounds. Shoot a small target from 3, 5, 7, or 10 yards without knowing whether each trigger press will fire a live or dummy round.
            
            When encountering a dummy round, your gun should remain steady during the trigger press. Any jerking or recoil anticipation will cause the gun to move off target. If this happens, pause the drill, perform a dozen precise dry-fire shots without issues, and then resume. This time, focus on isolating your trigger finger's movement while mentally counting to ten during the trigger press. Gradually press the trigger as you count, emphasizing the finger's movement only. This technique reduces recoil anticipation and trigger jerking.""";
    public static final String BENCH_SHOOTING = """
            Bench Shooting

            Target: 6-inch circle or VTAC

            Distance: 3 to 10 yards for pistol; 10 to 25 yards for rifle

            Rounds: 30 rounds for pistol; 60 rounds for rifle

            Start Position: High or low ready position

            To grasp sight alignment and sight picture, simplify the variables by using a bench rest. This eliminates the need for stability while shooting. Sit at a bench, support your arms with a shooting bag, and focus on achieving precise sight alignment and sight picture. Take your time and aim for maintaining perfect sights throughout each shot.""";
    public static final String FIGURE_EIGHT = """
            Figure 8 Drill

            Target: 6-inch circle or VTAC

            Distance: 3 to 7 yards

            Rounds: 15 rounds for pistol; 30 rounds for rifle

            Start Position: Weapon on target

            Beginners often struggle with a moving front sight, affecting their accuracy. However, with proper technique, you can achieve consistent accuracy despite front sight movement.
             
            Try the Figure 8 Drill at 3, 5, or 7 yards: point your gun at the target, remove trigger slack, and move the front sight in a figure-eight pattern over the bullseye. Break the shot as you cross the bullseye, then reset the trigger. Repeat for five or six shots. You'll discover that good trigger control permits front sight movement while maintaining accuracy.""";
    public static final String RAGGED_HOLE = """
            Ragged Hole Drill

            Target: 6-inch circle or VTAC

            Distance: Start at 3 yards– move back per iteration

            Rounds: 15 rounds for pistol; 30 rounds for rifle

            Start Position: High or low ready position

            From 3, 5 or 7 yards (depending on your skill level and weapon platform), slow fire three to five rounds into a single, small point on your target.
            
            Take your time and use the exact same point of aim each time. Do not chase your shots or try to make corrections.
            
            If you manage your fundamentals properly, such as your grip, trigger control, and sight alignment, you should end up with a single, ragged hole. If your shots are spread out, it is a sign that you need to spend more time on the basics.""";
    public static final String EXEMPLAR_DRILL = """
            Exemplar Drill

            Target: 6-inch circle or VTAC

            Distance:\s
            
            Pistol: Any

            Rounds: 15 rounds for pistol; 30 rounds for rifle

            Start Position: Weapon on target

            The Exemplar Drill, a partner exercise, helps shooters grasp correct trigger press techniques. Begin with your preferred two-handed stance and steady your sights on the target.\s
            
            While gripping the firearm firmly with all fingers except the index finger, a knowledgeable partner approaches from your dominant-hand side. Your trigger finger lightly touches the trigger, exerting no pressure, and your partner's trigger finger guides yours, pressing it straight back until the shot fires. Repeating this process a dozen times enhances your understanding of proper trigger press for improved accuracy.
            """;
    public static final String CIRCLE_WU_CD = """
            1-Inch Circle Warm-up / Cool Down

            Target: 1-2-3 Target Circle

            Distance: 3 Yards

            Rounds: 15 Rounds

            Start Position: High or low ready position

            A great warm up or cool down drill, here, you can either use a single 1-inch circle or ten 1-inch circles on a piece of paper.
            
            There are no time restrictions. From 3-yards, try to hit either the same 1-inch circle ten times or each of the ten 1-inch circles with one shot.
            
            Focus on your mechanics and accuracy–this is not a speed drill. Once you can land ten shots in a row with no misses, you can add more distance.""";
    public static final String ONE_FINGER_TP_DRILL = """
            One Finger Trigger Press Drill

            Target: One 1-inch circle or square

            Distance: 3 Yards

            Rounds: 15 rounds for pistol

            Start Position: Weapon on target

            This drill hones your trigger press. Perform it at a distance of 3 yards, aiming at a 1-inch circle or square target.
            
            You can complete this drill using both your strong and support hand. Grip your pistol with just the web of your hand, index finger, and thumb, leaving the remaining three fingers relaxed, like the "three amigos."\s
            
            Control the weapon with your thumb and index finger, press the trigger smoothly, and aim to hit the 1-inch target. Timing is not a factor in this drill. If you can consistently hit the target with 10 consecutive rounds without any misses, consider increasing the shooting distance.""";
    public static final String ONE_TWO_THREE_CIRCLE = """
            1-2-3 Circle Pistol Drill (Vertical)

            Target: One 1-inch circle or square

            Distance: 3 to 5 yards

            Rounds: 30 Rounds

            Start Position: Holster
            
            Score:
            
                Beginner: > 20 seconds, no misses
                Intermediate: 12 to 20 seconds, no misses
                Advanced: < 12 seconds, no misses

            This drill helps you understand the interplay between shooting speed, accuracy, and target size.
            
            Start from the holster at 3 to 5 yards using the 1-2-3 Circle Target. On the signal, draw your pistol and fire three shots at a three-inch circle, followed by two shots at a two-inch circle above it, and conclude with one shot on a one-inch circle. Holster your weapon.
            
            As the target size decreases, you'll need to slow down. Repeat this sequence two more times to cover the entire 1-2-3 Circle Target sheet.
            
            For advanced shooters, complete the entire target in one repetition, including a reload if needed.
            
            In the learning phase, it's acceptable to miss shots and continue, but strive to achieve a clean run with no misses.
            
            Afterward, reverse the order, starting with the 1-inch circle, followed by the 2-inch circle, and concluding with three shots on the 3-inch circle. Repeat this until you complete the target sheet.""";

    public static final String THROTTLE_CONTROL_VERT = """
            Throttle Control Rifle Drill (Vertical)

            Target: One 3-inch circle, one 6-inch circle, and one 9-inch circle stacked on top of one another (see video)
            
            Distance: 7 to 15 yards
            
            Rounds: 30 rounds (with no misses)
            
            Start Position: High or low-ready
            
            Score:
            
               Beginner: > 4 seconds, no misses
                Intermediate: 2.5 to 4.0 seconds, no misses
                Advanced: < 2.5 seconds, no misses

            This drill helps you understand the balance between shooting speed, accuracy, and target size.
            
            Start at 7 to 15 yards, using a USPSA target with painted circles: a 9-inch circle over the torso, a 6-inch circle in the chest, and a 3-inch circle over the head zone.
            
            On the signal, engage the 9-inch circle with 3 shots, followed by 3 shots in the 6-inch circle, and finally 3 shots in the 3-inch circle. Adjust your speed based on target size. The goal is to hit within the circles.
            
            Once you master this, increase difficulty by going faster or moving back. Aim for only 2-3 misses per run as a sign of pushing your limits. Perform the drill with at least one 30-round magazine. Then, reverse the order and repeat on a fresh target.""";

    public static final String THROTTLE_CONTROL_VARIATION = """
            Throttle Control Rifle Drill (Variation)

            Target: One 3-inch circle, one 6-inch circle, and one 9-inch circle stacked on top of one another (see video)
            
            Distance: 7 to 15 yards
            
            Rounds: 30 rounds (with no misses)
            
            Start Position: High or low-ready
            
            Score:
            
                Beginner: > 12 seconds, no misses
                Intermediate: 8 to 12 seconds, no misses
                Advanced: < 8 seconds, no misse

            This drill helps you understand the balance between shooting speed, accuracy, and target size.
            
            Begin at 7 to 15 yards, using a USPSA target with four circles: one 6-inch and three 3-inch circles. You'll need one 30-round magazine for this drill.
            
            On the signal, engage the 6-inch circle with 5 shots, then transition to one of the 3-inch circles for 3 shots. Alternate between the 6-inch and 3-inch circles in this pattern. The goal is to hit all shots within the circles.
            
            Once you achieve this, challenge yourself by increasing speed or moving back. Aim for just 2-3 misses per run to push your limits. Complete the drill with one 30-round magazine.""";
    public static final String SLOW_AIM_FIRE = """
            25-Yard Slow Aimed Fire

            Target: NRA B8 Repair Center Target

            Distance: 25 yards

            Rounds: 15 Rounds

            Start Position: Holster
            
            Score:
            
                Beginner: < 71
                Intermediate: 71 to 90
                Advanced: 91+

            From 25 yards, fire 10-rounds at a B8 repair center bullseye target. Slow fire.

            Total up your scores.

            Once you can consistently shoot an 85 or above, consider adding a time standard.""";
    public static final String TWENTY_FIVE_TIMED = """
            25-Yard Timed Drill

            Target: NRA B8 Repair Center Target

            Distance: 25 yards

            Rounds: 15 Rounds

            Start Position: Holster
            
            Score:

                Beginner: > 35 seconds
                Intermediate: 21 to 35 seconds
                Advanced: 20 seconds or less

            From 25 yards, aim to shoot 10 rounds at a B8 repair center bullseye target quickly while ensuring all shots stay within the black area. Find the right cadence for achieving both speed and accuracy.
            
            While your goal is to keep all shots within the black, it's acceptable if a few stray outside.
            
            For additional performance tracking, record your scores and the time taken for each set of 10 rounds.""";
    public static final String BLIND_SWORDSMAN = """
            Blind Swordsman Drill

            Target: 6-inch circle or VTAC

            Distance: Any

            Rounds: 15 Rounds

            Start Position: High or low-ready
            
            Score:
            
                Beginner: > 35 seconds
                Intermediate: 21 to 35 seconds
                Advanced: 20 seconds or less

            In this drill, the shooter acquires a precise sight picture on the target, then closes their eyes to fire a single shot.
             
            Afterward, while keeping the gun on target, they release the trigger and open their eyes to assess the shot placement.
             
            The shooter repeats this process to focus on mastering trigger pull, particularly the sense of touch. Closing the eyes helps eliminate the distraction caused by visual cues, which can lead to jerky trigger pulls.
            
            Shooting with closed eyes makes it easier to maintain a smooth, straight-back trigger pull.""";
    public static final String HOSTAGE_DRILL = """
            Cold Bore Hostage Drill

            Target: A USPSA/IPSC target with a credit card A-zone over the head or a 3×5 postcard.\s

            Distance: Start 20 to 30 yards away

            Rounds: 1 Round

            Start Position: Holster

            Imagine a hostage scenario with a 3×5 postcard target representing the assailant holding a loved one hostage.
            
            Start the drill without warming up, positioning the target 20 to 30 yards away with your weapon holstered, either overt or concealed.
            
            Visualize the situation briefly, then act as if you are confronting the assailant. The decision to draw and fire can vary, and there are no specific rules.
            
            The objective is to approach the target closely and, when prepared, take a single headshot. Missing implies harm to your loved one, so accuracy within the confines of a standard USPSA target's credit card box or an index card is essential.""";
    public static final String WALKBACK_DRILL = """
            Walkback Drill

            Target: Steel

            Distance: Starts at 5 yards

            Rounds: 5 Rounds

            Start Position: High or low ready

            This drill emphasizes accuracy and distance shooting. Begin at the 5-yard mark, taking one shot with both hands at a steel target, which should be smaller for more experienced shooters.
            
            If you hit the target, move back 5 yards to the 10-yard line. Missing at 5 yards allows two more attempts to hit the target, but you must switch to single-handed shooting.
             
            First, use your strong hand; if you succeed, advance to the 10-yard line. Failing on the second shot means switching to your support hand. If you miss with your support hand, the drill ends. Hitting the target lets you proceed to the 10-yard line.
            
            Repeat the same process at the 10-yard line. The goal is to enhance long-range accuracy by pushing the limits of your shooting distance while maintaining precision.""";
    public static final String RANGEMASTER_BULLSEYE = """
            Rangemaster Bullseye Course

            Target: NRA B8 Repair Center Target

            Distance: Varies

            Rounds: 30 rounds

            Start Position: High or low ready

            Score: A score of 285 out of 300.

            This drill, created by Tom Givens, involves a B8 Bullseye Target and consists of four stages.
            
                1. Begin at 25 yards for the first stage, which assesses precision. Upon the go signal, fire 5 slow, aimed shots. You have up to a minute, and all shots can be taken from the ready position.
                2. Transition to the 15-yard line for the second stage, where you will complete 2 strings. First, fire five rounds in 15 seconds upon the signal. Then, on the go signal, fire 5 rounds in 10 seconds. Reducing the time challenges you to shoot faster while maintaining accuracy.
                3. Progress to the 7-yard line. Start with only five rounds in the pistol and have a spare magazine. Upon the go signal, fire five rounds, reload, and fire five more rounds, all within 15 seconds.
                4. For the final stage, move to the 5-yard line. On the signal, fire five rounds in 5 seconds. Calculate your score, with a maximum of 300 points possible.""";
    public static final String CLOVERLEAF_DRILL = """
            Cloverleaf Drill

            Target: 6-inch circle or VTAC

            Distance: Start at 3 yards

            Rounds: 3 rounds per repetition - 15 rounds per drill

            Start Position: High or low ready

            This is a straightforward and enjoyable drill that can be done at various distances, with 3 yards being a good starting point.
            
            Select any clear area on a target or cardboard backing. Take one shot with both hands, and where that shot lands becomes your target for the next shot. Then, switch to your strong hand and attempt to hit your previous shot. Finally, switch to your support hand and try to hit your initial shot. The goal is to make all three shots touch.""";
    public static final String UNKNOWN_GUN_DRILL = """
            Unknown Gun Drill

            Target: Partner Determined

            Distance: Partner Determined

            Rounds: Partner Determined - 10 Rounds

            Start Position: Partner Determined

            This partner drill involves handing your firearm and two magazines to your partner, who will then arrange them out of your view to create malfunctions and weapon manipulation challenges. Dummy rounds may be incorporated.
            
            Your task is to respond to these challenges swiftly, restoring your weapon to operational status and engaging targets accurately. While there's no set time limit, aim to resolve issues promptly. Both pistols and rifles can be used for this drill.""";
    public static final String GROUND_CLOCK = """
            Ground Clock Drill

            Target: USPSA or IPSC target\s

            Distance: 5 to 10 yards

            Rounds: 15 rounds for pistol; 30 rounds for rifle\s

            Start Position: Varies

            Imagine you're at the center of a clock, aiming to shoot in all directions from various positions. Start prone with an unloaded firearm holstered. Draw and engage a target at 12 o'clock, then reholster. Repeat at 3 o'clock, 6 o'clock, and 9 o'clock.
            
            Once mastered, repeat the drill with your strong hand and support hand, addressing complications to avoid muzzling yourself.
            
            Extend the drill to various positions: prone, right side, left side, sitting, kneeling (both knees, right knee, left knee).
            Transition to live fire by adjusting your body to simulate different clock positions while keeping the target aligned with the backstop. Start slowly, then use a shot timer to push your speed while ensuring accuracy.
            
            Be cautious about shooting over the backstop when firing from extreme angles. Adjust target height as needed to prevent stray rounds.""";
    public static final String FORWARD_ASSAULT = """
            Forward Assault Drill

            Target: NRA B8 Repair Center Target\s

            Distance: Start at 25-yards and work your way to the 7-yard line

            Rounds: 10 rounds for pistol; 10 rounds for rifle

            Start Position: Varies

            Score: At least 80 points in 20 seconds or less for pistol; 15 seconds or less for rifle

            This drill by Ethan Johns from SWAT magazine uses a standard NRA B8 bullseye repair center target. Scoring is based on actual points, with 10-ring hits being more valuable than outer circle hits.
            
            Begin at 25 yards with a holstered pistol or in the low/high ready position with a rifle. Upon the signal, draw (for pistol) or bring your rifle to the ready position and fire two rounds. Safely advance to the 15-yard line and fire two more rounds. Continue to the 7-yard line, maintaining control of your firearm, and fire three rounds. Finally, advance forward from the 7-yard line while firing three additional rounds. Record both your score and time.""";
    public static final String CATCH_TWENTY_TWO = """
            Catch 22 Drill

            Target: Steel

            Distance: 15 yards

            Rounds: 15 Rounds – if no misses

            Start Position: Holster

            Score: Under 26 seconds

            Dave Sevigny designed this drill to assess draw speed and trigger control using a steel target placed 15 yards away, along with a shot timer.
            
            Perform the following sequences five times each, recording your times for each run:
                1. Draw and fire (freestyle) until you hit the target.
                2. Draw and fire with your strong hand only until you hit the target.
                3. Draw, transfer your gun to your weak hand, and fire weak hand only until you hit the target.
            You can take as many shots as needed to achieve a hit. After completing all fifteen runs, calculate your total score by adding up the recorded times.
            
            Note: A standard weak hand only draw is slower for most people, so it's recommended to avoid it unless you have specific professional training in its safe execution with a live firearm.""";
    public static final String TRI_TEN_DRILL = """
            Tri-10 Drill

            Target: 6-inch circle or VTAC

            Distance: 10 yards

            Rounds: 10 rounds

            Start Position: Holster

            Score: 10 shots, in 10 seconds, at 10 yards

            To perform this drill, you'll need a shot timer and any target or steel plate. The target size can be adjusted based on your experience level.
            
            Set the shot timer to a 10-second par time. When it starts:
                1. Fire 4 shots freestyle (using both hands).
                2. Transition to your strong hand only and fire 3 shots.
                3. Transition to your weak hand only and fire 3 shots.
                
            If the drill is too challenging or too easy, you can modify the scoring zone, distance, or time limit as needed.""";
    public static final String TRIPLE_SIX = """
            Triple Six Drill

            Target: USPSA or IPSC targets with an A-Zone

            Distance: 6, 12, and 18 yards

            Rounds: 18 rounds

            Start Position: Holster

            Score: 9 seconds or less

            Arrange three targets at staggered distances: one at 6, one at 12, and one at 18 yards. The drill consists of three strings of fire:
                        
                At 6 yards, draw and fire 6 rounds. Record the time.
                At 12 yards, draw and fire 6 rounds. Record the time.
                At 18 yards, draw and fire 6 rounds. Record the time.
                
            Apply the following penalties to your raw times:
                Add 0.20 seconds for each hit in the C zone.
                Add 0.50 seconds for each hit in the D zone.
                Add 1.0 second for any misses.
            Calculate your final score by adding the three raw times to the scoring zone penalties.""";
    public static final String TRANSITION_DRILL = """
            Rifle/Handgun Transition Drill

            Target: Three USPSA targets

            Distance: Varies

            Rounds: 30 rounds rifle; 6 rounds pistol

            Start Position: Low ready with rifle; pistol in holster

            Score: Complete the drill in less than 60 seconds

            Kyle Lamb designed this fast-paced transition drill suitable for both indoor and outdoor ranges permitting forward movement toward the target.
            
            You'll require three USPSA targets, 30 rifle rounds, and 6 pistol rounds. Here's the drill:
                1. Start at 20 yards with the rifle in the low ready position. On the buzzer, fire two shots on each target. Switch the rifle to the support side and fire two shots on each target. Safely secure the rifle and move to the 15-yard line.
                2. At 15 yards, fire two shots on each target with the rifle from the support side. Switch the rifle to the strong side and fire two more shots on each target. Safely secure the rifle and advance to the 10-yard line.
                3. At 10 yards, fire two shots on each target with the rifle from the strong side. Transition to your pistol and fire two shots on each target.
                
            For penalties, add 1/2 second to your running time for each shot in the "C" zone and one second for each shot in the "D" zone.""";
    public static final String CONTROLLED_PAIR = """
            Controlled Pair

            Target: 6-inch circle or VTAC

            Distance: 3 – 7 yards

            Rounds: 15 rounds for pistol; 30 rounds for rifle

            Start Position: Low ready with rifle; pistol in holster

            Score: Complete the drill in less than 60 seconds

            Starting from either the high or low ready position, extend your weapon towards the target and fire two rounds accurately. Ensure you achieve a second and third sight picture during this process.
            
            It's essential to maintain clear sight alignment throughout the exercise. Avoid double-tapping, meaning you should take one sight picture for each of the two shots fired.""";
    public static final String CHECKLIST_DRILL = """
            Checklist Drill

            Target: 6-inch circle or VTAC

            Distance: 3 – 7 yards

            Rounds: 10 rounds pistol; 10 rounds rifle

            Start Position: Varies

            The "Check List" drill emphasizes fundamental skills, making it an ideal warm-up exercise. It centers around a checklist focused on marksmanship fundamentals:
                • Ensure a proper grip.
                • Maintain a high grip.
                • Align both thumbs forward.
                • Apply dominant hand pressure to the front and rear of the grip, while support hand pressure is applied to the sides.
                • Keep proper front sight focus.
                • Pull the trigger straight to the rear without grip shifts.
                • Reacquire the front sight after each shot.
                
            Execute the drill by taking one shot and assessing yourself using the checklist. As you progress, increase the shot count for evaluation, gradually evolving your skill as a shooter.""";

    public static final String FIVE_SECOND_STANDARDS = """
            5-Second Standards

            Target: USPSA or IPSC target

            Distance: Varies

            Rounds: 15 Rounds

            Start Position: Varies

            Score: 5 seconds

            The "Check List" drill is a great warm-up exercise that focuses on essential marksmanship fundamentals. It involves a checklist:
                • Ensure a proper grip.
                • Maintain a high grip.
                • Align both thumbs forward.
                • Apply dominant hand pressure to the front and rear of the grip, while support hand pressure is applied to the sides.
                • Keep proper front sight focus.
                • Pull the trigger straight to the rear without grip shifts.
                • Reacquire the front sight after each shot.
                
            Execute the drill by taking one shot and evaluating your performance based on the checklist. As you improve, increase the shot count for assessment, gradually enhancing your shooting skills.""";
    public static final String ALTERNATING_TARGETS = """
            Alternating Targets Drill

            Target: VTAC

            Distance: pistol – 5 yards; rifle – 10 yards

            Rounds: 30 rounds pistol; 60 rounds rifle

            Start Position: High ready

            Score: No misses

            This drill combines fundamental skills and can be conducted at 5 yards for pistols or 10 yards for rifles. Use any target with a body and head or paper to represent them.
            
            Start from the high ready position. On the signal, extend your gun and fire two shots at the body. Follow through and optionally scan and assess.
            
            On the next repetition, repeat the process but fire two shots at the head. Alternate between body and head targets for a total of 20 reps (10 on each).
            
            Ensure all shots hit their target; no misses are permitted.""";
    public static final String FOUR_FIVE_SIX_SEVEN = """
            4567 Drill

            Target: 6-inch circle or VTAC

            Distance: 7 yards

            Rounds: 20 rounds

            Start Position: Varies

            Score:

                Beginner: 22 seconds
                Intermediate: 18 seconds
                Advanced: 13 seconds

            Designed by Chris Edwards and Todd Green, this drill is run four times, five rounds each, on a six-inch circle at 7-yards, thus the name 4567 Drill.
            
            The four courses of fire are:
                Draw and fire 5 rounds from concealment, two-handed
                Draw and fire 5 rounds from concealment, strong hand only
                From the ready position fire 5 rounds, weak hand only, fire 5 rounds
                From concealment, two-handed (repeat of string 1)
            Make sure each string of fire is timed.
            
            For any shot outside of the 6″ circle, add 1 second to your time. Total the times (and penalties) for all four strings to determine your overall score.""";
    public static final String CIRCLE_DRILL = """
            Circle Drill

            Target: Steel or circular target

            Distance: 7 yards

            Rounds: 18 rounds

            Start Position: Varies

            Score: Land at least 16 of the 18 shots

            The Circle Drill demonstrates the interplay between speed and accuracy, emphasizing the impact of time on marksmanship fundamentals.
            
            Begin by firing six rounds at a slow pace (1 shot per second) at an 8-inch plate from 7 yards, repeating this step. This stage focuses on basic marksmanship without time pressure.
            Then, increase the tempo. Fire six rounds at a moderate pace (2 shots per second) and repeat. This speed represents the typical comfort zone for most shooters, maintaining reasonable accuracy.
            
            Lastly, maximize speed by firing six rounds at approximately 4 shots per second, or as fast as control allows. Repeat this step. This pace challenges shooters to manage recoil and sight tracking while accepting some decrease in accuracy, with the goal of retaining 90% or more hits on the plate.""";
    public static final String EL_PREZ_DRILL = """
            El Presidente Drill

            Target: USPSA or IPSC target

            Distance: pistol – 10 yards; rifle – 15 yards

            Rounds: 12 rounds

            Start Position: Holster

            Score:

                Pistols
                    Beginner: >4 seconds
                    Intermediate: 2 to 4 seconds
                    Advanced: <2 seconds
                Rifles
                    Beginner: >2 seconds
                    Intermediate: 1 to 2 seconds
                    Advanced: <1 second


            The El Presidente drill involves setting up three targets about one yard apart and ten yards from you. The targets should have a designated vital area.
            
            Load six rounds into two magazines and your handgun. Place the spare magazine in a pouch. Start with your concealed handgun holstered (or use an overt holster if preferred).
            
            Begin with your back to the target, hands raised in the surrender position. When the timer signals, turn, draw your firearm, and point the muzzle downrange.
            
            Fire two rounds into the vital zone of each target, moving from left to right or right to left. Reload after the initial six shots and repeat in the opposite direction for a total of 12 shots to complete the drill.""";
    public static final String MOZAMBIQUE_DRILL = """
            Mozambique Drill

            Target: USPSA or IPSC target

            Distance: pistol – 7 yards; rifle – 10-15 yards

            Rounds: 3 rounds

            Start Position: Low ready with rifle; pistol in holster

             Score (No misses):

                Beginner: Greater than 12 seconds
                Intermediate: 9 to 12 seconds
                Advanced: Less than 9 seconds

            The Mozambique Drill is a classic firearms exercise that combines multiple skills. You'll need a target featuring a head and chest area and three rounds per repetition.
            
            Start at 7 yards with a pistol or 10 to 15 yards with a rifle. On the signal, draw (with a pistol) or push out from a high or low ready position (with a rifle).
            
            Perform a double-tap (two quick shots) to the chest and then transition to the head for the final shot.
            
            If you find yourself firing the first two shots without a sight picture, you're moving too quickly. Prioritize accuracy over speed. Additionally, ensure proper follow-through by obtaining a final sight picture after the headshot to avoid developing bad habits.""";
    public static final String DOT_TORTURE_DRILL = """
            Dot Torture Drill

            Target: Dot Torture Target

            Distance: Start at 3-yards; increase distance as necessary\s

            Rounds: 50 rounds

            Start Position: Varies

            Score: No misses

            The Dot Torture drill is a classic firearms exercise that combines various skills. The target consists of small 2-inch dots, promoting careful marksmanship. To pass, you must achieve 50 hits out of 50 shots; a single miss is a failure.
            
            Start at 3 yards and adjust the distance as your skills improve. There's no set time limit; the target provides instructions.
            
            Here's a brief overview of each dot:
                1. Dot 1: Fire 5 shots slowly.
                2. Dot 2: Draw and fire one shot, repeat 5 times.
                3. Dots 3 & 4: Draw, fire one shot on 3, transition, and fire one shot on 4, repeat 4 times.
                4. Dot 5: Draw and fire five shots with your strong hand.
                5. Dots 6 & 7: Draw and fire two shots on 6 and two shots on 7, repeat 4 times.
                6. Dot 8: From the low ready, aim and fire five shots with your weak hand.
                7. Dots 9 & 10: Draw, fire one shot on 9, perform a speed reload, and fire one shot on 10 (Load one round in your gun's magazine and two in your pouch for this stage).""";
    public static final String COLLATERAL_DRILL = """
            Collateral Drill

            Target: Two targets: USPSA/IPSC targets or VTAC

            Distance: Start at 2-yards
            \s
            Rounds: 5 rounds

            Start Position: Holstered – concealed

            Score: Less than 2.5 seconds

            Start with two targets about 2 yards away, one yard apart. Your holstered gun should be concealed by a jacket or open button-up shirt, allowing you to sweep it open for access.
            The drill commences with a left-arm swipe, mimicking disarming your opponent. Utilizing this motion, clear your cover garment and draw your firearm. Fire two close retention shots at the first target.
            
            Rotate your body to engage the second target while stepping forward with your non-dominant leg for a better firing position. Reach a full presentation and fire two shots to the chest, followed by a final shot to the head. The drill concludes here.
            
            Achieving this drill in under 2.5 seconds with all five shots in the vital zones is an excellent performance standard. Solid hits in the vital zones are essential for success.""";
    public static final String VTAC_TRIPLE_THREAT_DRILL = """
            VTAC Triple Threat Drill

            Target: Three VTAC targets

            Distance: 5-yards

            Rounds: 15 rounds

            Start Position: High or low ready
               \s
            Score:
                    Pistol
                        Beginner: Greater than 9 seconds
                        Intermediate: 7 to 9 seconds
                        Advanced: Less than 7 seconds
                    Rifle
                        Beginner: Greater than 8 seconds
                        Intermediate: 6 to 8 seconds
                        Advanced: Less than 6 seconds

            Designed by Kyle Lamb for rifles but adaptable for pistols, this drill utilizes three human silhouette targets. Ensure each target features distinct pelvis, chest, and head zones.
            
            Position yourself 5 yards from the targets, with a yard of separation between them. Begin with the middle target, firing three shots to the chest, one shot to the pelvis, and one shot to the head in quick succession.
            
            Repeat this sequence on the left target and then the right target. The drill is considered successful only if all shots hit within the designated target areas. Accuracy and sight control are vital to completing the exercise effectively.""";

    public static final String VTAC_ONE_FIVE = """
            VTAC 1 to 5 Drill

            Target: Three targets: USPSA/IPSC targets or similar

            Distance: 5-yards

            Rounds: 15 rounds

            Start Position: High or low ready

            Score: Less than 5 seconds

            The VTACT 1 to 5 Drill combines fundamental skills, target transitions, and the concept of shooting until the threat is neutralized.
            
            In real-life situations, it often takes more than just two rounds to incapacitate an opponent. It could require 3, 4, or 5 shots. Therefore, it's essential to continue shooting until the threat is eliminated.
            
            Excessive focus on the "two shots and transition" concept during training can lead to the development of bad habits that may surface at critical moments.
            
            For the drill, arrange three USPSA/IPSC targets or similar targets, spaced a yard apart, at a distance of 5 yards from your position. Upon the signal, engage the targets from left to right: one shot on the first target, two shots on the middle target, and three shots on the right target. Then transition to the middle target and fire four shots, followed by transitioning to the left target and firing five shots.""";
    public static final String VTAC_RELOAD = """
            VTAC Reload Drill

            Target: USPSA or IPSC target

            Distance: 10-yards

            Rounds: 9 rounds pistol; 9 rounds rifle

            Start Position: Holster; high or low ready with a rifle
            
                Score:
                
                    Pistol
                        Beginner: Greater than 8 seconds
                        Intermediate: 6 to 8 seconds
                        Advanced: Less than 6 seconds
                    Rifle
                        Beginner: Greater than 10 seconds
                        Intermediate: 8 to 10 seconds
                        Advanced: Less than 8 seconds

            Originally conceived by Kyle Lamb for pistols, this drill can also be executed with a rifle.
            
            Begin in a loaded and holstered (or high/low-ready with a rifle) position, facing a USPSA/IPSC target placed 10 yards away. Upon the go signal, draw (or raise your rifle) and fire three rounds into the A-zone. Then, perform a reload and fire three more rounds into the A-zone. Repeat the reload and fire three additional rounds into the A-zone, totaling nine rounds fired.""";
    public static final String FAST_DRILL = """
            FAST Drill

            Target: USPSA or IPSC target
              \s
            Distance: 7-yards

            Rounds: 6 rounds
               \s
            Start Position: Holster
               \s
            Score:
                    10+ seconds: Novice
                    Less than 10 seconds: Intermediate
                    Less than 7 seconds: Advanced
                    Less than 5 seconds: Expert

            Created by Todd Green, this drill assesses marksmanship fundamentals and drawing skills.
            
            Prepare your target with a 3×5 index card for headshots and an 8-inch plate or circle for body shots.
            
            Load one magazine with two rounds and another with four rounds, then insert the two-round magazine into your pistol.
            
            Upon the buzzer, draw your weapon from concealment or an overt holster and fire two headshots. After reaching slide lock, reload and fire four body shots.
            Strictly avoid any misses.""";
    public static final String HACKATHORN_HEADSHOT = """
            Hackathorn 3-Second Headshot Standards

            Target: USPSA or IPSC target

            Distance: 5-yards pistol; 10-yards for rifles

            Rounds: 9 rounds

            Start Position: Varies.

            Score: Less than 3 seconds for each string; minimum of 7 hits

            This drill, created by Ken Hackathorn for pistols but adaptable for rifles, involves targets placed two feet apart, shoulder to shoulder, at either 5 or 10 yards.
            
            Each string has a three-second par time, and there are three strings of fire:
                1. Shoot one headshot at each target from left to right.
                2. Shoot one headshot at each target from right to left.
                3. Start with the middle target and shoot one headshot at each target, finishing with the two outside targets in any order.
                
            Hits within the head's scoring zone (both A and B zones for the IPSC target) count as hits, while shots fired after the 3-second par time are considered misses.
            
            The goal is to achieve seven or more hits out of nine total shots, according to Hackathorn. When using a pistol, start from a standard ready position and progress to holster and concealment if successful. For rifles, begin from a high or low ready position.""";
    public static final String SWITCH_HITTING_DRILL = """
            Switch Hitting Drill

            Target: Four 3×5 index cards

            Distance: 3-yards

            Rounds: 8 rounds

            Start Position: Low or high ready starting with your strong hand only

            Score: 2 shots on each target in less than 10 seconds, no misses

            Switch-hitting, designed by Todd Green, is a straightforward drill aimed at enhancing your one-handed target accuracy.
            
            Use two 3×5 index cards as targets, positioned one foot apart, three yards away from you. Set a shot timer to a ten-second par time.
            
            Begin in the ready position with your strong hand only. At the buzzer, engage the target on your dominant hand side (usually the right target) with one shot. Carefully switch the gun to your non-dominant hand and fire one shot at the left-hand target. Then, pass the gun back to your strong hand and repeat until the timer signals.
            
            The objective is to place two shots on each target within the ten-second timeframe. For added challenge, increase the distance to 5 yards if you find it too easy.""";
    public static final String PISTOL_PYRAMID_DRILL = """
            Pistol Pyramid Drill

            Target: Pistol Pyramid Target

            Distance: Start at 3-yards

            Rounds: 10 rounds

            Start Position: Varies

            The Pistol Pyramid Drill employs a custom pyramid target that can be downloaded. The target consists of numerous empty blocks, which can be filled with numbers, shapes, or colors.
            
            The core of the Pistol Pyramid is the target with random numbers from 1 to 5 in each block. Shoot the numbers sequentially, starting with all the 1s, then the 2s, and so on. This challenges your tracking skills in both horizontal and vertical directions and encourages thoughtful shooting.
            
            To add complexity, consider shooting odd numbers once and even numbers twice, keeping your mental engagement throughout the drill.""";
    public static final String TRI_LAMBDA_DRILL = """
            Tri-Lambda Drill

            Target: Nine USPSA targets

            Distance: 3 to 5 yards (pistol); 7 to 15 yards (rifle)

            Rounds: 18 rounds

            Start Position: Holster with pistols; low or high ready with rifles

            Score: Less than 8 seconds (pistol); less than 10 seconds (rifle)

            The Tri-Lambda, designed by Kyle Lamb, employs nine USPSA targets to emphasize controlled pairs over fast double-taps.
            
            Three targets are set up in a row at 3 to 5 yards. On the left and right sides, three more targets are placed at a 45-degree angle to the center trio. One target in each side grouping includes a "hostage" partially covering the central "A" zone or set up for a headshot.
            
            Upon the buzzer, the shooter draws and fires two shots at each center target, then reloads and shoots two shots at either the left or right targets. Finally, reload and fire two shots at the remaining targets.
            
            Typically, first-timers complete the drill in about 15 seconds, improving to 10 seconds with practice, and less than eight seconds for the best performers.
            
            Scoring adds half a second for each point dropped outside the "A" zone, with a miss resulting in a 20-second penalty. Hitting a hostage adds 20 seconds plus an additional 20 for the miss.
            
            Although originally designed for pistols, the drill can be adapted for rifles at 7-15 yards.""";
    public static final String PUNTO_BANCO_DRILL = """
            Punto Banco Drill (Pistols)

            Target: Six 2 or 3-inch circle targets

            Distance: 3-yards
            Rounds: 39 rounds with no misses

            Start Position: Holster

            Score: No misses

            The Pistol Punto Banco drill is a pistol variation of the Punto Banco drill, with a starting distance of 3 yards (adjustable for difficulty).
            
            You'll use custom-made circle targets, each 2 to 3 inches in diameter, with random numbers 1 to 6 inside. The objective is to shoot each circle the indicated number of times, not more or less, resulting in a total of thirty-nine hits across all circles. The drill helps you develop real-time target assessment, accurate shot placement, quick focus transitions, and target transitions. It's an untimed exercise.
            
            Sequence 1 (12 rounds):
                • Place the target at 3 yards for clear visibility.
                • Load no more than 10 rounds in a magazine.
                • Start from the holster.
                • Fire two shots on each circle in numerical order: (1), (2), (3), (4), (5), (6).
                • Reload as needed during the sequence, but do not reload at the sequence's end.
                • If you miss any shots, make them up before proceeding to the next circle.
                • After reloading, continue to engage the same circle without finishing all required shots.
                • Holster your weapon and top off your magazines except the one in your pistol.
                
            Sequence 2 (6 rounds):
                • Start from the holster.
                • Fire one shot on each circle in numerical order: (1), (2), (3), (4), (5), (6).
                • Make up missed shots before moving on.
                • Reload as necessary during the sequence, but do not reload at the sequence's end.
                • Holster your weapon and top off your reload magazines but not the one in your pistol.
                
            Sequence 3 (21 rounds):
                • Start from the holster.
                • Fire (1) one time, (2) two times, (3) three times, (4) four times, (5) five times, and (6) six times.
                • Make up missed shots before proceeding to the next circle.
                • Reload as necessary during the sequence.
                • Safely put down your weapon.""";
    public static final String PAR_FIVE_DRILL = """
            Par 5 Drill

            Target: NRA B8 Repair Center Target

            Distance: 25-yards

            Rounds: 10 rounds

            Start Position: Low or high ready

            Score: No misses, 5 second par time for each string of fire

            This advanced drill, created by Justin Dyal, emphasizes the sight alignment and trigger break relationship at varying tempos and distances. It involves four strings of fire, each shot at 25 yards within a five-second time limit, using a standard NRA B8 Bullseye Repair Center target from the ready position.
                • String 1: One shot
                • String 2: Two shots
                • String 3: Three shots
                • String 4: Four shots
            The four strings amount to ten shots and offer a maximum score of 100 points. Late hits are counted as misses.""";
    public static final String MODIFIED_ROUND_UP_DRILL = """
            Modified 5-Yard Round-Up Drill

            Target: 3×5 Index Card

            Distance: 5-yards

            Rounds: 10 rounds

            Start Position: Holster

            Score: Less than 9 seconds

            This drill, inspired by Justin Dyal's 5-Yard Round-Up Drill and designed by Dave Spaulding, is conducted from 5 yards using a 3×5 index card target with the following course of fire:
            
                1. Draw and fire five rounds using both hands (freestyle).
                2. Transition to your strong hand and fire three rounds using only your strong hand.
                3. Quickly transition the pistol to your weak hand and fire two more rounds.
                
            A successful run requires all hits in under 9 seconds.""";
    public static final String ONE_TWO_RELOAD_THREE = """
            1-2-Reload-3 Drill

            Target: 1-2-3 Circle Target

            Distance: 3 to 5-yards\s

            Rounds: 6 rounds

            Start Position: Holster

            Score: Less than 7 seconds

            This modified drill is based on Todd Green's 1-2-R-3 drill and employs the 1-2-3 Circle target.
            
            Begin with three rounds in the holstered gun. Set a 7-second PAR time using a shot timer. Upon the buzzer:
                • Fire one round at the 1" circle.
                • Fire two rounds at the 2" circle.
                • Perform a reload.
                • Fire three rounds at the 3" circle.""";
    public static final String HATEFUL_EIGHT = """
            Hateful 8

            Target: NRA B8 Repair Center Bullseye Target

            Distance: 8-yards (pistol); 15-yards (rifle)

            Rounds: 8 rounds

            Start Position: Holster (pistol) or high or low ready (rifle)

            Score: 8 second par time (80 maximum points)

            Bill Blowers designed this drill initially for pistols but can be adapted for rifles.
            
                • For pistols, use an 8-yard B-8 Repair Center target. Start holstered with 4 rounds in your gun and two magazines, each loaded with 2 rounds.
                • For rifles, begin at 15 yards.
            Upon the buzzer:
                • Draw your weapon (start from the high or low ready with a rifle) and fire 4 shots.
                • Perform a reload.
                • Fire 2 shots.
                • Perform another reload.
                • Fire 2 more shots.""";

    public static final String THROTTLE_CONTROL_DRILL = """
            Throttle Control Drill

            Target: One 8.5 x 11 piece of paper

            Distance: 5-yards

            Rounds: 15 rounds

            Start Position: Holster

            Score: Less than 7 seconds

            Designed by Subject Matter Expert Fred Ruiz, this drill focuses on fundamentals and throttle control.
            
            Tear an 8.5x11 piece of paper into 5 pieces and mark them as shown in the attached video.
            
            Fire 5 shots in Box A, 1 shot in Box B, reload, then fire 4 shots in Box C, 2 shots in Box D, and 3 shots in Box E.""";
    public static final String TEN_TEN_TEN = """
            10-10-10 Shooting Drill

            Target: NRA B8 Repair Center Target

            Distance: 10-yards

            Rounds: 10 rounds

            Start Position: Holster

            Score: All shots in the black in 10 seconds

            Numerous adaptations of this drill exist, mostly derived from Ken Hackathorn's original design.
            
            Begin at a distance of 10 yards from a B-8 Center bullseye target and place 10 shots within the black area in a 10-second timeframe.
            
            Experienced shooters will find this task relatively straightforward. To increase the challenge, attempt to draw from concealed carry and step aside from the starting position just before initiating the drill.""";
    public static final String TEN_IN_FIFTEEN = """
            15 in 10 Shooting Drill

            Target: USPSA Targets

            Distance: Varies

            Rounds: 15 rounds

            Start Position: Holster
            \s
            Score: All shots in the A-Zone in 10 seconds

            Despite efforts to identify the drill's creator, no definitive source has been found. However, indications suggest that Mike Pannone may be the originator, with our initial exposure to the drill coming from Fred Ruiz.
            
            This drill effectively hones a range of skills and throttle control as it involves engaging targets at varying distances.
            Using three USPSA targets, position the first at 5 yards, the second at 10 yards, and the last at 20 yards from your starting point.
            
            Upon the start signal, fire five rounds at 20 yards, followed by five rounds at 10 yards, and conclude with five rounds at 5 yards.
            
            Record your times for each iteration and tally them. The objective is to keep all shots within the A zone within a 10-second timeframe.""";
    public static final String WIZARD_DRILL = """
            Wizard Drill

            Target: USPSA Target

            Distance: Varies

            Rounds: 5 rounds

            Start Position: Concealed holster

            Score: Each string of fire should be completed in 2.5 seconds with all shots in the A-Zone

            Designed by Ken Hackathorn for concealed carriers, this drill requires just 5 rounds and a USPSA/IDPA target.
            
            Commencing with a concealed carry holster, each string of fire must be completed within 2.5 seconds.
                1. 3 yards: One headshot, strong hand only.
                2. 5 yards: One headshot, using both hands on the gun.
                3. 7 yards: One headshot, using both hands on the gun.
                4. 10 yards: Two body shots, using both hands on the gun.
                
            All shots must land in the A-zone; any misses result in failure. If you fail, you can restart the drill from the ready position. Once you can successfully complete the drill, challenge yourself by using the concealed holster again.""";
    public static final String THREE_TRANSITION_DRILL = """
            3 Target Transition Drill (Static)

            Target: Three USPSA Targets

            Distance: 7-yards (pistol) and 10 yards (rifle)

            Rounds: 9 rounds

            Start Position: Holster (pistol) or high or low ready (rifle)

             Score (Total):
             
                Pistol
                    Beginner: Greater than 10 seconds
                    Intermediate: 7 to 10 seconds
                    Advanced: Less than 7 seconds
                Rifle
                    Beginner: Greater than 7 seconds
                    Intermediate: 5 to 7 seconds
                    Advanced: Less than 5 seconds

            Originally featured on the Modern Service Weapons blog, this drill involves three partially obscured targets.
            
            Commence from either 7 yards with a pistol or 10 yards with a rifle, starting from the holster. Execute three strings of fire:
                One shot on each target, Left-Right.
                One shot on each target, Right-Left.
                One shot on each target, Center-Left-Right or Center-Right-Left.
                
            The aim is to place all shots within the A-zones.""";
    public static final String POLICE_MARKSMAN_DRILL = """
            Police Marksman Drill

            Target: 3 x 5 index card

            Distance: 3, 5 and 7-yards

            Rounds: 30 rounds

            Start Position: Holster

            Score:
                3-yards: 20 seconds
                5-yards: 22 seconds
                7-yards: 26 seconds

            Adapted from Police Marksman Magazine, this drill combines various skill sets, including shooting on the move, handling malfunctions, and weapons manipulation.
            
            You'll require 30 rounds in total and organize your magazines as follows:
                1. Start with one magazine containing 2 rounds.
                2. Use two magazines, each loaded with 4 live rounds and 2 dummy rounds in random order (avoid consecutive dummy rounds and placing them as the first or last rounds in the magazine).
                
            Shoot a 3" x 5" note card at three yards. Begin by drawing and firing all rounds in the first magazine at the card. Reload and continue firing, moving laterally during each reload and malfunction clearance, while working through the other two magazines.
            
            Repeat this drill at 3-yards, then at 5-yards, and finally, perform the drill twice at 7-yards.""";
    public static final String X_DRILL = """
            X Drill

            Target: Two 3 x 5 index cards and two 8-inch circles, or any target with a defined head and body area

            Distance: 7-yards (pistol); 10-yards (rifle)

            Rounds: 32 rounds

            Start Position: Holster (pistol); ready position (rifle)

            Score: N/A

            Created by the late Todd Green, this drill enhances target transitions and helps shooters balance accuracy and speed when engaging various-sized and distanced targets.
            
            Prepare two targets, A and B, each featuring a 3"x5" card for the head zone and an 8" circle for the body zone.
            
            From the 7-yard line (pistol) or 10-yard line (rifle), starting from the holster (pistol) or ready position (rifle), fire two rounds in an "X" pattern at each target zone. Repeat the drill four times, beginning with a different zone each time:
                1. A-head, B-body, A-body, B-head
                2. B-head, A-body, B-body, A-head
                3. B-body, A-head, B-head, A-body
                4. A-body, B-head, A-head, B-body
                
            Pairs aimed at larger body zones should be quicker than those aimed at smaller head zones. Shooters must adapt their rate of fire to the target's size and distance.
            
            If your headshots are as fast as body shots and all hits are achieved, increase the speed of body shots. Fire at a pace appropriate to the target. The same drill can be conducted with a rifle from a high or low-ready position at the 10-yard line.""";
    public static final String ONE_RELOAD_TWO = """
            1-Reload-2 Drill

            Target: USPSA Target

            Distance: 5-yards (pistol); 10-yards (rifle)

            Rounds: Rounds: 3 rounds per drill - One Mag total

            Start Position: Holster (pistol); ready position (rifle)

            Score:
            
                Pistol
                    Beginner: Greater than 4 seconds
                    Intermediate: 2.5 to 4.0 seconds
                    Advanced: Less than 2.5 seconds
                Rifle
                    Beginner: Greater than 6 seconds
                    Intermediate: 4 to 6 seconds
                    Advanced: Less than 4 seconds

            **Video displays 1-Reload-1**

            A close-range drill by Todd Green focuses on rapid reload and target re-acquisition.
            
            Using a pistol, position yourself 5 yards away from a USPSA/IDPA target with your gun aimed at the target's A-zone.
             
             Upon the signal, fire one round at the A-zone, then perform a reload and fire two more rounds at the same A-zone.
             
            This drill improves upon the traditional 1-reload-1 drill by necessitating two shots after the reload, ensuring the shooter achieves accurate and fast hits through a proper grip and follow-through.
            
            You can choose between a slide-lock reload, speed reload, or retention (tactical) reload. For the rifle, replicate the same drill but from a distance of 10 yards.
            """;
    public static final String TWO_SIX_SIX_SIX_TWO = """
            26662 Shooting Drill

            Target: 26662 Pistol Target or Rifle Target

            Distance: 5-yards (pistol); 10-yards (rifle)

            Rounds: 5 rounds

            Start Position: Holster (pistol); ready position (rifle)

            Score: Varies

            The 26662 drill, designed by the late Todd Green, enhances your drawing and the transition between precision and speed shots.
            
            Use a target featuring two 2" circles and one 6" circle
            Distance to the target can range from 3 to 7 yards (pistol) or 7 to 10 yards (rifle) based on your proficiency.
            
            From the holster (pistols) or high or low-ready (rifles), fire one round at the top 2" circle, followed by three rounds at the 6" circle, and conclude with one round at the bottom 2" circle, adhering to the prescribed sequence. Record your time and establish a par time for improvement.
            
            Gradually reduce tenths of a second from the par time to enhance speed. Once consistently achieving hits within 3-4 seconds, increase the target's distance by a yard or two and repeat.
            
            To maintain variety and prevent familiarity, rotate the target's orientation during each session, altering the position of the small circles (right, left, top, or bottom).
            
            This drill can also be adapted for rifles, but we recommend shifting to the 7 to 10-yard line and replacing the two 2-inch circles with two 3-inch circles alongside the 6-inch circle.""";
    public static final String THREE_FIVE_CARD_DRILL = """
            3×5 Card Drill

            Target: 3 x 5 Index Card

            Distance: Varies

            Rounds: 18 rounds

            Start Position: Holster (pistol); ready position (rifle)
            \s
            Score: No misses

            Using a 3x5 card, fire six rounds for accuracy at your own pace. Begin at three yards, aiming for all six bullet holes to touch.
            
            If successful, proceed to the next stage, firing six shots to hit the card from 4-yards. If all shots connect, increase the distance to 5-yards.
            
            Continue moving farther from the target as long as all six shots land on the index card. Cease when you start missing.
            
            For a pistol challenge, use three cards and perform the drill freestyle, strong-hand only, and weak-hand only at each distance.
            
            With a rifle, start at the 5-yard line and employ holdovers for precise shots.""";
    public static final String FOUR_TWENTY_TRANSITION = """
            4 x 20 Transition Drill

            Target: Four steel plates or similar

            Distance: 10-yards

            Rounds: 20 rounds

            Start Position: Holster (pistol); ready position (rifle)
            Score: 20 hits in under 10 seconds (pistol); under 8 seconds (rifle)

            Created by Scott Warren, this drill works best with four steel plates or suitable substitutes like paper plates or sheets.
            Space targets at least two feet apart edge to edge at a 10-yard range and have a timer ready.
            
            Upon the start signal, engage one shot per target back and forth for a total of 20 rounds, avoiding double shots at the end. Follow this sequence: T1-T2-T3-T4-T3-T2-T1-T2, etc. No makeup shots are allowed; if you miss a shot, proceed to the next target.
            
            The objective is to achieve all twenty hits in under 10 seconds.
            For rifles, use frangible ammo when shooting steel up close (unless using paper targets). Aim for all twenty hits in under 8 seconds.""";
    public static final String FIVE_FIVE_SKILL = """
            5 x 5 Skill Test

            Target: USPSA Target

            Distance: 10-yards

            Rounds: 25 rounds

            Start Position: Holster

            Score:
                Grand Master: 15 seconds or less
                Master: 20 seconds or less
                Expert: 25 seconds or less
                Sharpshooter: 32 seconds or less
                Marksman: 41 seconds or less
                Novice: 50 seconds or less

            Created by Bill Wilson of Wilson Combat, this 10-yard drill uses a standard USPSA or IDPA target and involves 25 rounds.
            
            With your hands at your side and starting from the holster, complete four timed strings of fire:
                1. Draw and fire 5 shots freestyle.
                2. Draw and fire 5 shots (strong hand only).
                3. Draw and fire 5 shots freestyle, then reload from slide-lock and fire 5 more shots freestyle.
                4. Draw and fire 4 shots to the body and 1 shot to the head freestyle.""";
    public static final String PRESS_SIX_DRILL = """
            Press Six Drill

            Target: Six 2-inch circle target

            Distance: 3 to 7-yards

            Rounds: 62 rounds

            Start Position: Holster

            Score: Varies for each string of fire.

            Press Six, created by the late Todd Green, consists of six strings of fire that enhance press-out skills and rapid target engagement. Utilize a target sheet with six 2-inch circles arranged in two rows of three.
            
            Range distance can vary from three to seven yards based on the shooter's proficiency.
            
            The six strings of fire are as follows:
                1. Top left dot: Draw and fire one shot, focusing on a proper press-out, with no time limit. Repeat ten times.
                2. Top center dot: Draw and fire one shot, focusing on a proper press-out, with a 3-second PAR time. Repeat ten times.
                3. Top right dot: Draw and fire one shot, focusing on a proper press-out, with a 2-second PAR time. Repeat ten times.
                4. Lower left dot: Draw and fire two shots, emphasizing a proper press-out and precise sight tracking, with no time limit. Repeat five times.
                5. Lower center dot: Draw and fire two shots, emphasizing a proper press-out and precise sight tracking, with a 3-second PAR time. Repeat five times.
                6. Lower right dot: Draw and fire three shots, emphasizing a proper press-out and precise sight tracking, with a 3-second PAR time. Repeat four times.
                
            Start at a distance where you can consistently achieve hits on the slow strings (1 and 4), then work on increasing speed to meet the PAR times. Once you can hit all dots reliably, extend the distance by a yard or two.""";
    public static final String LANGDON_THREE_SECOND = """
            Langdon 3.5-Second Standards

            Target: Three IDPA or USPSA/IPSC targets

            Distance: 7 yards

            Rounds: 24 rounds

            Start Position: Holster

            This drill requires three IDPA or USPSA targets spaced at shoulder height with at least a two-foot gap between them. All shots must land in the -0 or A zones.
            
            Use a shot timer set to a 3.5 second PAR time for each string; exceeding the time or dropping any points is a failure. You can modify this drill to include lateral and forward movement. As well as changing order of target engagement.
                1. 7 yards - Left to Right:
                    ◦ Two body shots on each target
                    ◦ Two head shots on each target
                    ◦ Two body shots on each target
                2. 7 yards – Right to Left:
                    ◦ Two body shots on each target
                    ◦ Two head shots on each target
                    ◦ Two body shots on each target
                3. 7 yards – Left to Right:
                    ◦ Two head shots on each target
                    ◦ Two body shots on each target
                    ◦ Two head shots on each target
                4. 7 yards – Right to Left:
                    ◦ Two head shots on each target
                    ◦ Two body shots on each target
                    ◦ Two head shots on each target""";
    public static final String SIX_STEEL_RACK = """
            Six Steel Plate Rack

            Target: Six Steel Plate Rack

            Distance: 7-yards with a pistol; 10-yards with a rifle using frangible ammo

            Rounds: 6 rounds

            Start Position: Holster (pistol) / Low or High Ready (rifle)
            
            Score:
            
                Pistol
                    Beginner: 4.1 seconds or greater
                    Intermediate: 2.6 to 4.0 seconds
                    Advanced: 2.5 seconds or less
                Rifle
                    Beginner: 3.1 seconds or greater
                    Intermediate: 1.6 to 3.0 seconds
                    Advanced: 1.5 seconds or less

            The six plate drill enhances speed in target acquisition and transitions.
            
            You'll require a plate rack for this drill.
            
            With a pistol, begin from the holster at 7 yards. For rifles, start at a minimum of 10 yards from the high or low ready position, but only with frangible ammo. If frangible ammo is unavailable, avoid using a rifle for this drill to prevent injury.
            
            Upon the start signal, engage the steel plates from left to right or right to left, aiming to clear the plate rack without any misses.
            
            You can vary this drill to work different transition combinations.\s""";

    public static final String WEAVER_DRILL = """
            Weaver Drill

            Target: USPSA Target or similar

            Distance: At least 10-yards

            Rounds: 18 rounds

            Start Position: Low-Ready

            This drill utilizes 6 cones and 3 silhouette targets, preferably AR500 12×20-inch steel targets, to emphasize size, distance, and shooter skills.
            
            The shooter initiates from Cone 1, engaging the far-right target from a static standing position at a 30-meter distance before moving through the weaver. While weaving through the cones, the shooter continuously engages Target 1 on both sides during forward movement (note: one shot per target).
            
            Upon reaching Cone 4, the shooter veers left (similar to CQB door entry) and engages the center steel target from the right side during lateral movement, practicing target leading. This stage also highlights the significance of target size at 15 meters.
            
            Upon arrival at Cone 5, the shooter reverses around it and engages Target 3. While conducting angular movement, the shooter turns and engages Target 2 before reaching Cone 1, where they engage Target 1 from a standing position.
            
            Upon reaching Cone 6, the shooter, while moving laterally, engages Target 2, reinforcing target leading in relation to size and distance. Finally, at Cone 6, the shooter engages Target 3 from a static standing position.
            
            For added difficulty, reduce the box size to challenge the shooter's speed. This drill can also be adapted for pistol training by adjusting the box size accordingly.""";

    public static final String BILL_DRILL = """
            Bill Drill

            Target: USPSA Target or similar

            Distance: 7-yards

            Rounds: 6 rounds

            Start Position: Holster (Pistol) / High or Low-Ready (Rifle)

            Score:
            
                Pistol
                    Beginner: Greater than 3.5 seconds
                    Intermediate: 2.5 to 3.5 seconds
                    Advanced: Less than 2.5 seconds
                Rifle
                    Beginner: Greater than 2.5 seconds
                    Intermediate: 1.5 to 2.5 seconds
                    Advanced: Less than 1.5 seconds

            This classic Bill Drill, typically conducted at 7 yards with a USPSA or IPSC target, hones various skills. However, the same goal can be achieved with any 6-shot drill on a single target performed at speed.
            
            Using a holster (pistol) or high/low ready position (rifle), upon the start signal, fire six shots as quickly as possible, aiming for six hits on the target.
            
            The Bill Drill improves sight tracking, proper visual reference, recoil management, and trigger manipulation. It emphasizes firing the next shot as soon as the front sight reverts to the scoring zone during recoil, without waiting for precise alignment or sight stabilization in the middle of the target.
            
            At full speed, the front sight remains in constant motion until the drill concludes. The same drill can be executed with a rifle.""";
    public static final String BILL_DRILL_TWO = """
            Bill Drill 2

            Target: USPSA Target or similar

            Distance: 7-yards

            Rounds: 15 rounds

            Start Position: Holster (Pistol) / High or Low-Ready (Rifle)

            Score: 10-second total (Pistol) / 7-second total (Rifle)

            This is a newer version of the classic Bill Drill developed by Bill Wilson. Here, one gets to practice on the draw more.
            
            From 7-yard away, engage the A-zone on an USPSA or IPSC target, the 0 zone on an IDPA targret, or an 8-inch circle, with the following five strings of fire. Deduct a half-second from your time for every miss.
            
            There are five strings of fire, each for time:

                Draw and fire 1 shot.
                Draw and fire 2 shots.
                Draw and fire 3 shots.
                Draw and fire 4 shots.
                Draw and fire 5 shots.
            Bill Wilson suggests a 10-second total score as a goal for a pistol. Shoot for 7-seconds with a rifle. You can conduct the same drill with a rifle but from the high or low ready position.""";

    public static final String FRANK_GARCIA_DOT = """
            Frank Garcia’s Dot Drill

            Target: Six 2-Inch Circle Target

            Distance: 7-yards

            Rounds: 36 rounds

            Start Position: Holster or ready position

            Score: 5 Second Par Time with no misses

            Created by Frank Garcia, this drill emphasizes both marksmanship and speed, adding pressure to shooters. You'll need a target featuring six 2-inch circles, which can be downloaded above.
            
            Place the target 7 yards away and set a shot timer to a 5-second PAR time. Upon the start signal, draw and fire six shots at the first 2-inch circle on the target, noting the number of hits within the PAR time. Shots fired after 5 seconds count as misses.
            
            Repeat the drill with the same 5-second PAR time for each of the remaining 2-inch circles. You will fire a total of 36 rounds with six separate start signals.
            
            Ensure your gun is loaded with at least six rounds before starting each circle. If your range prohibits drawing from a holster, begin the drill from your chosen ready position.""";
    public static final String VTACK_HALF_HALF = """
            VTAC Half and Half Drill

            Target: USPSA Target

            Distance: Varies

            Rounds: 30 rounds

            Start Position: Ready position

            Score: Par time varies

            The Half & Half drill, by Kyle Lamb and Mike Pannone, uses the A-zone of a USPSA/IPSC target, the 0 zone of an IDPA target, or an 8-inch circle. It consists of three strings of fire, decreasing distance and par time with each string.
            
            For rifles, start from the high or low ready and complete:
                1. 10 rounds at 20 yards, 10-second PAR time.
                2. 10 rounds at 10 yards, 5-second PAR time.
                3. 10 rounds at 5 yards, 2.5-second PAR time.
            All shots must be fired before the PAR time ends; shots fired afterward count as misses.
            
            For pistols, start from concealment or a retention holster and perform:
                1. 10 rounds at 20 yards, 14-second PAR time.
                2. 10 rounds at 10 yards, 7-second PAR time.
                3. 10 rounds at 5 yards, 3.5-second PAR time.
            Hits in the scoring zone earn 10 points each, while misses, shots fired after the PAR time, or unfired shots score zero. The maximum possible score is 300.""";
    public static final String PRONE_DRILL = """
            Prone Drill

            Target: Three USPSA Targets

            Distance: 15-yards (Pistol) / 20-yards (Rifle)

            Rounds: 6 rounds

            Start Position: Holster (Pistol) / Ready position (Rifle)

            Score: Less than 8 seconds (rifle) / less than 10 seconds (pistol) – No misses.

            This straightforward drill focuses on transitioning to and firing from the prone position. Arrange three USPSA targets or similar targets in a row, spaced about 1 yard apart.
            
            For pistol users, commence from 15 yards; for rifle users, start from 20 yards. Begin from the holster (pistol) or high/low ready (rifle).
            
            Upon the start signal from a standing position, swiftly drop to prone and fire two shots at each target, aiming for all shots to land in the A zone.
            
            For pistol users, prioritize dropping to prone before drawing your weapon, ensuring excellent muzzle awareness and trigger finger discipline. If your range restrictions prohibit this, draw your weapon while standing and then assume the prone position.""";
    public static final String BARRICADE_DRILL = """
            Barricade Drill

            Target: Three USPSA Targets

            Distance: 15-yards (Pistol) / 25-yards (Rifle)

            Rounds: 12 rounds - one pistol mag; one rifle mag

            Start Position: Holster (Pistol) / Ready position (Rifle)

            Score: Less than 15 seconds both pistol and rifle

            This is a straightforward drill for practicing shooting from barricades. Set up three USPSA targets or similar, spaced about 1 yard apart in a row.
            
            Begin from 15 yards with a pistol or 25 yards with a rifle, starting from the holster (pistol) or high/low ready (rifle).
            
            Ensure all shots hit the A zone. Start from a standing position behind a barricade. Upon the start signal, draw or present your weapon, then fire 2 rounds on each target from cover while standing. Afterward, perform a tactical reload and fire 2 rounds on each target from cover while kneeling.""";
    public static final String TWO_R_TWO_DRILL = """
            2-R-2 Drill

            Target: One USPSA Targets

            Distance: 7-yards (Pistol) / 15-yards (Rifle)

            Rounds: 4 rounds - one pistol mag; one rifle mag

            Start Position: Holster (Pistol) / Ready position (Rifle)

            Score: 3 second par time for pistols and 4 seconds for rifles; no misses

            This drill is an advancement from the 1-R-1 drill, providing a solid progression by firing two shots instead of one, allowing you to focus on maintaining a proper grip and enhancing recoil management.
            
            Utilize a USPSA target or any target featuring a defined A zone. Start from 15 yards with a rifle or 7 yards with a pistol.
            
            Upon the start signal, draw your weapon (pistols) or extend your weapon (rifles), and deliver two shots to the A zone. Reload, then fire two additional shots into the A zone.""";
    public static final String REMEDIAL_ACTION_DRILL = """
            Remedial Action

            This drill can be conducted dry with dummy rounds or using magazines mixed with live and dummy rounds.
            
            The objective is to induce a double feed malfunction in your weapon. Once you identify the double feed, lock your slide or bolt to the rear, then remove or strip the magazine from your weapon.
            
            In most instances, this action should resolve the double feed. Occasionally, manual intervention with your hands or fingers may be required to clear the malfunction.
            
            Once the malfunction is cleared, you can either load a new magazine or reinsert the one that was removed (if it's trouble-free). Finally, rack the slide to bring your weapon back into operational status.""";
    public static final String EMERGENCY_RELOAD = """
            Emergency Reload Drill

            Target: NRA B8 Bullseye Repair Center

            Distance: 7 yards (Pistol) / 10 yards (Rifle)

            Rounds: 9 rounds

            Start Position: Weapon on target

            Score: At least 24 points within 14 seconds.

            This straightforward drill by Tim Lau focuses on emergency reloads.
            
            Place a bullseye target at seven yards with a repair center. Load three magazines with 3, 5, and 7 rounds, respectively. Randomly select one magazine and load it into your gun, while keeping the other two in belt pouches. Start from the low ready position.
            
            Upon the go signal, fire all 9 rounds continuously, reloading as needed. Scoring can be based on two points for hits in the 9 and 10 rings and one point for hits in the 7 or 8 rings.""";
    public static final String SPEED_RELOAD = """
            Speed Reload Drill

            Rounds: 15 rounds for pistol; 30 rounds for rifle
            This fundamental dry drill is designed to enhance your weapons manipulation skills. The focus is on performing reloads when your ammunition is running low, just before reaching slide lock with your pistol or rifle. Speed reloads can be executed using various techniques or variations, so feel free to use the one that suits you best and is most comfortable.""";
    public static final String TAC_RELOAD = """
            Tactical Reload

            This is a fundamental drill designed to improve your weapons manipulation skills. The objective is to perform reloads before reaching slide lock with your pistol or rifle. Various techniques or variations can be employed for a tactical reload, so choose the one that suits you best and feels most comfortable.
            
            A Tactical Reload is employed when you have a partially full magazine and aim to restore the firearm to full or nearly full magazine capacity.""";
    public static final String TARGET_TRANSITION_FORWARD = """
            3 Target Transition – Moving Forward

            Target: Three USPSA Targets

            Distance: Start at 15 yards (Pistol) / Start at 25 yards (Rifle)

            Rounds: 9 rounds

            Start Position: Holster with a pistol or high/low ready with a rifle

            Score: All A Zone Hits.

            Position three USPSA/IPSC paper targets side by side with a minimum separation of 4 yards. If using a pistol, initiate the drill from 15 yards away and from the holster. For rifles, start from either a high or low ready position at 25 yards.
            
            Upon receiving the signal, begin by presenting your weapon while moving forward and engaging the three targets. Fire 3 shots at each target while in motion, and the order of engagement is flexible. Ensure that all shots hit the A-zone. If you're experiencing frequent misses, consider slowing down.
            
            As you move farther from your target, maintain a slower shot cadence. Gradually increase your speed as you approach the targets while preserving accuracy.""";
    public static final String TARGET_TRANSITION_LR = """
            3 Target Transition – Left or Right

            Target: Three USPSA Targets

            Distance: Start at 7 yards (Pistol) / Start at 15 yards (Rifle)

            Rounds: 9 rounds

            Start Position: Holster with a pistol or high/low ready with a rifle

            Score: All A Zone Hits.

            Arrange three USPSA/IPSC paper targets side by side with a minimum separation of 5 yards. For pistol users, commence the drill from 7 yards away, starting from the holster. If employing a rifle, begin at a distance of 15 yards, either from a high or low ready position.
            
            Upon receiving the signal, present your weapon and initiate lateral movement with the targets on your left/right. Engage the three targets by firing 3 shots at each as you move. Start with the farthest target and progress toward the nearest one. Ensure all shots hit the A-zone. If you find yourself frequently missing shots, consider reducing your speed.
            
            Maintain a slower shot cadence when farther from your target, gradually increasing your speed as you approach the targets while still preserving accuracy.""";
    public static final String FIGURE_EIGHT_MOVEMENT = """
            Figure 8 Movement Drill

            Target: Three USPSA Targets

            Distance: Start at 25 yards

            Rounds: 18 rounds

            Start Position: Holster with a pistol or high/low ready with a rifle

            Score: All A Zone Hits.

            This drill, performed on a single target (such as USPSA targets or any of your choosing, including steel plates), introduces dynamic movement while shooting.
            
            Arrange 4 to 6 cones in a straight line, beginning 25 yards away from your target. Maintain a spacing of 3 to 6 yards between each cone.
            
            Upon receiving the signal, commence your forward movement towards the target, firing 2 or 3 rounds, then swiftly transition to the opposite side, passing between the first set of cones, and engage the target once more with 2 or 3 rounds.
            
            Repeat this pattern until you reach the end of the cones. During each transition from one side to the other, maintain a compressed ready position.""";
    public static final String FORWARD_MOVEMENT = """
            Forward Movement

            Target: One USPSA Target

            Distance: Start at 15 yards (Pistol) / Start at 20 yards (Rifle)

            Rounds: 8 rounds

            Start Position: Holster with a pistol or high/low ready with a rifle

            Score: All A Zone Hits

            This drill, intended for a single target (preferably USPSA targets but adaptable to others or steel plates), focuses on forward movement while shooting.
            
            There are multiple approaches to this drill, and we'll outline one method which you can customize based on your proficiency.
            
            For pistols, initiate the drill from 15 yards away from your target. Upon the signal, draw your pistol while advancing toward the target, and commence engaging it. Fire 5 to 8 shots as you approach the 7-yard line. Terminate the drill once you reach the 7-yard line or after firing 5 to 8 shots, whichever occurs first. The objective is to achieve all shots within the A-zone of a USPSA target. If you experience frequent misses, consider reducing your speed.
            
            With a rifle, perform the same procedure but start from 20 yards away and advance to 10 yards. Again, aim to fire 5 to 8 shots before reaching the 10-yard line, with all shots landing in the A-zone. Begin from either a low or high ready position.""";
    public static final String BACKWARD_MOVEMENT = """
            Backward Movement

            Target: One USPSA Target

            Distance: Start at 7 yards (Pistol) / Start at 10 yards (Rifle)

            Rounds: 8 rounds

            Start Position: Holster with a pistol or high/low ready with a rifle

            Score: All A Zone Hits

            This drill, suitable for a single target (favoring USPSA targets but adaptable to others or steel plates), introduces the concept of moving backward while shooting.
            
            Numerous approaches are possible for this drill; we'll outline one method that you can adjust to match your proficiency.
            
            For pistols, initiate the drill from 7 yards away from your target. Upon receiving the signal, draw your pistol as you move away from the target and commence engaging it. Fire 5 to 8 shots while backing up toward the 15-yard line. Conclude the drill upon reaching the 15-yard line or after firing 5 to 8 shots, whichever happens first. The objective is to have all shots within the A-zone of a USPSA target. If your accuracy suffers, consider reducing your speed.
            
            With a rifle, execute a similar procedure, but begin from 10 yards away and move backward to 20 yards. Once more, aim to fire 5 to 8 precise shots before reaching the 20-yard line, with all shots landing in the A-zone. Start from either a low or high ready position.""";
    public static final String LATERAL_MOVEMENT = """
            Lateral Movement

            Target: One USPSA Target

            Distance: Start at 7 yards (Pistol) / Start at 10 yards (Rifle)

            Rounds: 5 rounds

            Start Position: Holster with a pistol or high/low ready with a rifle

            Score: All A Zone Hits

            This drill focuses on moving backward while shooting, using a single target, preferably USPSA targets, but other options or steel plates will work as well. There are various ways to approach this drill; we'll outline one method that you can adapt to your skill level.
            
            For pistols, begin at 7 yards from your target, which should be positioned at either 1 or 2 o'clock relative to your starting position. Upon receiving the signal, draw your pistol while moving laterally to the right and engage the target with 3 to 5 shots. The objective is to achieve all shots within the A-zone of a USPSA target without any misses. If your accuracy is inconsistent, consider reducing your speed.
            
            Reverse the direction for additional practice. When moving left, start from 7 yards away, with the target placed at either 10 or 11 o'clock in relation to your starting position. Execute a similar drill with a rifle, beginning from 10 yards. Once again, aim for 3 to 5 precise shots. Commence from either a high or low ready position.""";
    public static final String ACTION_REACTION = """
            Action – Reaction Drill

            Target: Varies

            Distance: Varies

            Rounds: Varies

            Start Position: Holster with a pistol or high/low ready with a rifle

            Score: Beat the “Leader” to the shot

            This is a partner drill involving a leader and a follower. The leader selects the initial position for both participants. The drill is known by various names, such as the "Rabbit and Coyote" drill, as demonstrated in the accompanying video featuring Mike Pannone.
            
            The leader initiates the drill by retrieving their weapon from its designated location, such as a holster or the ground, and engaging a target, preferably a steel one. Simultaneously, the follower must react to the leader's initial movement and attempt to hit the same target before the leader does.
            
            The follower's objective is to replicate the leader's movements for each repetition and score a hit on the target before the leader does. The first person to hit the target wins the round.""";

    public static final String GAS_PEDAL_DRILL = """
            Gas Pedal Drill

            Target: Multiple USPSA targets and one steel plate

            Distance: Varies

            Rounds: Varies

            Start Position: Low or High-Ready

            Score: No time; strive to land all A zone shots

            **The video shows a variation of the drill – modify as needed**
            
            This drill helps you practice alternating between quick and controlled movement, achieving "accurate speed."
            
            Set up a steel plate, preferably 25 yards away or more, and position 3 to 5 paper targets at 5 to 10-yard intervals between you and the steel plate.
            
            Upon the signal, engage the nearest paper target with three shots while advancing toward the steel plate. Ensure the first paper target is at least 3 yards away.
            
            After engaging the first paper target, transition immediately to shoot the steel plate while continuing your forward movement. You must hit the steel target before reaching the first paper target.
            
            Upon hitting the steel plate, increase your walking pace as you proceed to the first paper target line. Once there, engage the second paper target three times. Afterward, transition to the steel target, take one shot while moving, and then accelerate toward the second paper target line. Repeat this process for all paper targets.""";

    public static final String SHOULDER_TRANSITION_DRILL = """
            Shoulder Transition Drill

            Target: Multiple USPSA targets and one steel plate

            Distance: Varies

            Rounds: 12 Rounds

            Start Position: Low or High-Ready

            Score: No time; strive to land all A zone shots

            This drill is straightforward and focuses on rifle shoulder transitions. Begin with dry practice to master the technique before using live ammunition when you feel confident.
            
            Incorporate multiple target transitions into the drill, as demonstrated in the video. Practice your shoulder transitions while both stationary and in motion.""";

}
