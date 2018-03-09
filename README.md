# HerokuKotlinWorker
A simple *example* Kotlin app for Heroku, which uses only one worker dyno (zero web dyno) for no dyno sleeping.
Built with Gradle build automation system.

### What to Do after the First Deployment
`heroku ps:scale worker=1` (Setting 1 worker dyno)

### Important Files
- `build.gradle` (Kotlin stdlib will be included in the built `jar` file.)
- `Procfile` (The worker dyno will execute the created `jar` file.)
- `src/main/kotlin/io/bitbucket/naetmul/herokukotlinworker/HerokuKotlinWorker.kt` (A file where `fun main()` exists.)
