# obs-html-overlay
OBS Studio HTML Overlay Tools

The idea: OBS Studio allows to use HTML Files or URLs as dynamic overlays (Browser Overlay). I thought instead to create just one overlay, why not program a manager which is able to build html files with a designer.

## For Users

Start with java jar, or one of the scripts.

    java -jar obs-html-overlay-<version>.jar

## For Developers

Build with maven

    mvn clean install

### Tools used
- https://obsproject.com/ (obviously)
- https://javalin.io/documentation
- https://j2html.com
- https://www.dizitart.org/nitrite-database.html
- https://vuejs.org
