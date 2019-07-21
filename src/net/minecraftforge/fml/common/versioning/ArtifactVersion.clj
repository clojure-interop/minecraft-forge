(ns net.minecraftforge.fml.common.versioning.ArtifactVersion
  "Describes an artifact version in terms of its components, converts it to/from a string and
  compares two versions."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.versioning ArtifactVersion]))

(defn get-label
  "returns: `java.lang.String`"
  (^java.lang.String [^ArtifactVersion this]
    (-> this (.getLabel))))

(defn get-version-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ArtifactVersion this]
    (-> this (.getVersionString))))

(defn contains-version
  "source - `net.minecraftforge.fml.common.versioning.ArtifactVersion`

  returns: `boolean`"
  (^Boolean [^ArtifactVersion this ^net.minecraftforge.fml.common.versioning.ArtifactVersion source]
    (-> this (.containsVersion source))))

(defn get-range-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ArtifactVersion this]
    (-> this (.getRangeString))))

