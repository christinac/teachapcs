#Resources
`external.yaml` catalogs external resources shown on [http://teachapcs.com/microtext](http://teachapcs.com/microtext) and [http://teachapcs.com/microlectures](http://teachapcs.com/microlectures)

##Format

    key: [String - maps to a microtext filename]
    external:
      - text: [String]
        source: [String]
        url: [String]

Microtext filenames are visibile in the [reference/md](https://github.com/christinac/teachapcs/tree/master/reference/md) directory.

All links are shown in the [http://teachapcs.com/microtext](http://teachapcs.com/microtext). Only YouTube links are exposed as [http://teachapcs.com/microlectures](http://teachapcs.com/microlectures)