# atol-cps


# Get CPS models

Clone viatra CPS repository: https://git.eclipse.org/r/viatra/org.eclipse.viatra.examples
Go into the `cps` folder.
Edit `pom.xml`, change the `viatra.compiler.version` from `2.2.0-SNAPSHOT` to `2.2.0` (l. 83) and the url from `https://repo.eclipse.org/content/repositories/viatra-snapshot/` to `https://repo.eclipse.org/content/repositories/viatra2-releases/` (l.251).
I don't know why but viatra snapshot are broken right now.
Build and install into your local maven repository: `mvn install`
This will take some time.

# Build ATOL example

Now with viatra CPS installed in your local m2 repository you should be able to build the project with a gradle `./gradlew installDist`.

