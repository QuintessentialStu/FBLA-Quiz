public class Question{
  
  private String question;
  private String correct_answer;
  private String questionType;

  // Makes a question with the type of question, and question and answer choices, and the correct answer
  public Question(String type_of_question, String que, String corr_ans)
  {
      question = que;
      correct_answer = corr_ans;
      questionType = type_of_question;
  }

  // Returns the question with no answers
  public String getQuestion()
  {
      return question;
  }

  // Returns the correct answer
  public String getCorrectAnswer()
  {
      return correct_answer;
  }

  // Returns the question type
  public String getType()
  {
      return questionType;
  }
  
  // Compares the answer given by the user to the correct
  public boolean isCorrect(String other)
  {
    if (correct_answer.equals(other))
    {
      return true;
    }
    return false;
  }

  public String toString()
  {
    return question;
  }
}