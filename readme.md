# Paradox Example Plugin
> The example Plugin for [Paradox](https://github.com/PuzzleLoader/Paradox)

## How to setup Workspace
Run task `gradle setupWorkspace`

If you want to use your own Cosmic-Reach-Server.jar and Paradox.zip
- place them both in the libs folder and run `gradle setupWorkspaceFromLibs`

## How to test/build
For testing in the dev env, you can use the `gradle runServer` task

For building, `gradle buildJar` task can be used. The output will be in the `build/libs/` folder

## Notes
- Most project properties can be changed in the `gradle.properties`
- To change author, description and stuff that is not there, edit `src/main/resources/paradox.plugin.json`
- The project name is defined in `settings.gradle`
