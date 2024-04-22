import java.util.ArrayList;
public class StepTracker
{
 private int totalSteps, activeSteps, totalDays, activeDays;

 public StepTracker(int active){
  activeSteps = active;
  totalSteps = totalDays = activeDays = 0;
 }

 public void addDailySteps(int num){
  totalSteps += num;
  if(num > activeSteps)
   activeDays++;
  totalDays++;
 }

 public int activeDays(){
  return activeDays;
 }

 public double averageSteps(){
  if (totalDays == 0)
   return 0.0;
  return (double)totalSteps/totalDays;
 }
}
