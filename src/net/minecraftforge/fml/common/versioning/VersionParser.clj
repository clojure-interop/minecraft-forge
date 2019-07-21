(ns net.minecraftforge.fml.common.versioning.VersionParser
  "Parses version strings according to the specification here:
  http://docs.codehaus.org/display/MAVEN/Versioning
  and allows for comparison of versions based on that document.
  Bounded version specifications are defined as
  http://maven.apache.org/plugins/maven-enforcer-plugin/rules/versionRanges.html

  Borrows heavily from maven version range management code"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.versioning VersionParser]))

(defn ->version-parser
  "Constructor."
  (^VersionParser []
    (new VersionParser )))

(defn *parse-version-reference
  "labelled-ref - `java.lang.String`

  returns: `net.minecraftforge.fml.common.versioning.ArtifactVersion`"
  (^net.minecraftforge.fml.common.versioning.ArtifactVersion [^java.lang.String labelled-ref]
    (VersionParser/parseVersionReference labelled-ref)))

(defn *satisfies
  "target - `net.minecraftforge.fml.common.versioning.ArtifactVersion`
  source - `net.minecraftforge.fml.common.versioning.ArtifactVersion`

  returns: `boolean`"
  (^Boolean [^net.minecraftforge.fml.common.versioning.ArtifactVersion target ^net.minecraftforge.fml.common.versioning.ArtifactVersion source]
    (VersionParser/satisfies target source)))

(defn *parse-range
  "range - `java.lang.String`

  returns: `net.minecraftforge.fml.common.versioning.VersionRange`"
  (^net.minecraftforge.fml.common.versioning.VersionRange [^java.lang.String range]
    (VersionParser/parseRange range)))

