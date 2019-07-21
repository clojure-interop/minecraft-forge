(ns net.minecraftforge.fml.common.versioning.Restriction
  "Describes a restriction in versioning."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.versioning Restriction]))

(defn ->restriction
  "Constructor.

  lower-bound - `net.minecraftforge.fml.common.versioning.ArtifactVersion`
  lower-bound-inclusive - `boolean`
  upper-bound - `net.minecraftforge.fml.common.versioning.ArtifactVersion`
  upper-bound-inclusive - `boolean`"
  (^Restriction [^net.minecraftforge.fml.common.versioning.ArtifactVersion lower-bound ^Boolean lower-bound-inclusive ^net.minecraftforge.fml.common.versioning.ArtifactVersion upper-bound ^Boolean upper-bound-inclusive]
    (new Restriction lower-bound lower-bound-inclusive upper-bound upper-bound-inclusive)))

(def *-everything
  "Static Constant.

  type: net.minecraftforge.fml.common.versioning.Restriction"
  Restriction/EVERYTHING)

(defn upper-bound-inclusive?
  "returns: `boolean`"
  (^Boolean [^Restriction this]
    (-> this (.isUpperBoundInclusive))))

(defn contains-version
  "version - `net.minecraftforge.fml.common.versioning.ArtifactVersion`

  returns: `boolean`"
  (^Boolean [^Restriction this ^net.minecraftforge.fml.common.versioning.ArtifactVersion version]
    (-> this (.containsVersion version))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Restriction this]
    (-> this (.toString))))

(defn get-lower-bound
  "returns: `net.minecraftforge.fml.common.versioning.ArtifactVersion`"
  (^net.minecraftforge.fml.common.versioning.ArtifactVersion [^Restriction this]
    (-> this (.getLowerBound))))

(defn get-upper-bound
  "returns: `net.minecraftforge.fml.common.versioning.ArtifactVersion`"
  (^net.minecraftforge.fml.common.versioning.ArtifactVersion [^Restriction this]
    (-> this (.getUpperBound))))

(defn to-string-friendly
  "returns: `java.lang.String`"
  (^java.lang.String [^Restriction this]
    (-> this (.toStringFriendly))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Restriction this]
    (-> this (.hashCode))))

(defn lower-bound-inclusive?
  "returns: `boolean`"
  (^Boolean [^Restriction this]
    (-> this (.isLowerBoundInclusive))))

(defn equals
  "other - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Restriction this ^java.lang.Object other]
    (-> this (.equals other))))

