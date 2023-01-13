# Command to run Qodana on this project

```shell
docker run --rm -it -p 8080:8080 -v $PWD/:/data/project/ \                                                                           
-v $PWD/build/results/:/data/results/ \
-v $PWD/build/cache/:/data/cache/ \
-e IDE_PROPERTIES_PROPERTY='-Didea.headless.enable.statistics=false' jetbrains/qodana-jvm:2022.3-eap -baseline qodana.sarif.json --baseline-include-absent --run-promo true --show-report
```

