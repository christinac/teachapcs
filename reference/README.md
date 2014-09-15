#Microtext
`sections.yaml` tracks the snippets on [http://teachapcs.com/microtext](http://teachapcs.com/microtext)

##Format
Order is maintained across sections (e.g. "Introduction", "Numbers", "Booleans", etc.) and within sections (e.g. "Math operators", "Using math operators", "Casts and division", etc.)

Keys match files stored in the `md` and `html` folders.

    title: [String]
    order: [float]
    block:
        - key: [String]
          order: [float]

`transform.sh` converts and copies the markdown contents of files in the `md` directory to the `html` directory. Requires [Python-Markdown](https://pythonhosted.org/Markdown/install.html).