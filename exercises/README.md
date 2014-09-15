#Popular Exercises
`units.yaml` tracks the exercises on [http://teachapcs.com/exercises](http://teachapcs.com/exercises)

##Format
Exercises consist of:

- `text.md` and `text.html` which introduce the exercises
- `exercise.md` and `exercise.html` which detail the task
- `output.txt` *or* `output.html` which demonstrate what the program should "do" when it's done
- `hint[$d].md` and `hint[$d].html` which give quick hints to solve the exercise
- Starter code, saved as a `.java` file

[Python-Markdown](https://pythonhosted.org/Markdown/install.html) is one way to convert markdown files (which can be easier to read, write, and maintain) to HTML files.

## Format
    title: [String]
    text: [String]
    order: [float]
    exercise:
      - title: [String]
          tags:
             - key [String - (currently) no standardization]
          label: [String - one of 'student', 'polish', or 'sketch']
          solved: [String - YouTube video embed suffix to a video of someone coding a solution]
          objective: [String - not currently exposed]
          blockuse:
            - key: [String - maps to a microtext filename - not currently exposed on TeachAPCS.com]
          tools:
            - key: [String - maps to dictionary 'word']
          extra:
            - text: [String]
              source: [String]
              url: [String / URL]

