(ns net.minecraftforge.fml.common.versioning.DefaultArtifactVersion
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.versioning DefaultArtifactVersion]))

(defn ->default-artifact-version
  "Constructor.

  label - `java.lang.String`
  range - `net.minecraftforge.fml.common.versioning.VersionRange`"
  (^DefaultArtifactVersion [^java.lang.String label ^net.minecraftforge.fml.common.versioning.VersionRange range]
    (new DefaultArtifactVersion label range))
  (^DefaultArtifactVersion [^java.lang.String version-number]
    (new DefaultArtifactVersion version-number)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DefaultArtifactVersion this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn compare-to
  "o - `net.minecraftforge.fml.common.versioning.ArtifactVersion`

  returns: `int`"
  (^Integer [^DefaultArtifactVersion this ^net.minecraftforge.fml.common.versioning.ArtifactVersion o]
    (-> this (.compareTo o))))

(defn get-label
  "returns: `java.lang.String`"
  (^java.lang.String [^DefaultArtifactVersion this]
    (-> this (.getLabel))))

(defn contains-version
  "source - `net.minecraftforge.fml.common.versioning.ArtifactVersion`

  returns: `boolean`"
  (^Boolean [^DefaultArtifactVersion this ^net.minecraftforge.fml.common.versioning.ArtifactVersion source]
    (-> this (.containsVersion source))))

(defn get-version-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DefaultArtifactVersion this]
    (-> this (.getVersionString))))

(defn get-range-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DefaultArtifactVersion this]
    (-> this (.getRangeString))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DefaultArtifactVersion this]
    (-> this (.toString))))

(defn get-range
  "returns: `net.minecraftforge.fml.common.versioning.VersionRange`"
  (^net.minecraftforge.fml.common.versioning.VersionRange [^DefaultArtifactVersion this]
    (-> this (.getRange))))

