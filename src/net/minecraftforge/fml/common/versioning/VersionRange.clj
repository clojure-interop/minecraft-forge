(ns net.minecraftforge.fml.common.versioning.VersionRange
  "Construct a version range from a specification."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.versioning VersionRange]))

(defn *new-range
  "Factory method, for custom versioning schemes

  version - version - `net.minecraftforge.fml.common.versioning.ArtifactVersion`
  restrictions - restriction list - `java.util.List`

  returns: a new version range - `net.minecraftforge.fml.common.versioning.VersionRange`"
  (^net.minecraftforge.fml.common.versioning.VersionRange [^net.minecraftforge.fml.common.versioning.ArtifactVersion version ^java.util.List restrictions]
    (VersionRange/newRange version restrictions)))

(defn *create-from-version-spec
  "Create a version range from a string representation

   Some spec examples are

   1.0 Version 1.0
   [1.0,2.0) Versions 1.0 (included) to 2.0 (not included)
   [1.0,2.0] Versions 1.0 to 2.0 (both included)
   [1.5,) Versions 1.5 and higher
   (,1.0],[1.2,) Versions up to 1.0 (included) and 1.2 or higher

  spec - string representation of a version or version range - `java.lang.String`

  returns: a new VersionRange object that represents the spec - `net.minecraftforge.fml.common.versioning.VersionRange`

  throws: net.minecraftforge.fml.common.versioning.InvalidVersionSpecificationException"
  (^net.minecraftforge.fml.common.versioning.VersionRange [^java.lang.String spec]
    (VersionRange/createFromVersionSpec spec)))

(defn *create-from-version
  "version - `java.lang.String`
  existing - `net.minecraftforge.fml.common.versioning.ArtifactVersion`

  returns: `net.minecraftforge.fml.common.versioning.VersionRange`"
  (^net.minecraftforge.fml.common.versioning.VersionRange [^java.lang.String version ^net.minecraftforge.fml.common.versioning.ArtifactVersion existing]
    (VersionRange/createFromVersion version existing)))

(defn restrict
  "Creates and returns a new VersionRange that is a restriction of this
   version range and the specified version range.

   Note: Precedence is given to the recommended version from this version range over the
   recommended version from the specified version range.

  restriction - the VersionRange that will be used to restrict this version range. - `net.minecraftforge.fml.common.versioning.VersionRange`

  returns: the VersionRange that is a restriction of this version range and the
           specified version range.

           The restrictions of the returned version range will be an intersection of the restrictions
           of this version range and the specified version range if both version ranges have
           restrictions. Otherwise, the restrictions on the returned range will be empty.


           The recommended version of the returned version range will be the recommended version of
           this version range, provided that ranges falls within the intersected restrictions. If
           the restrictions are empty, this version range's recommended version is used if it is not
           null. If it is null, the specified version range's recommended
           version is used (provided it is non-null). If no recommended version can be
           obtained, the returned version range's recommended version is set to null. - `net.minecraftforge.fml.common.versioning.VersionRange`

  throws: java.lang.NullPointerException - if the specified VersionRange is null."
  (^net.minecraftforge.fml.common.versioning.VersionRange [^VersionRange this ^net.minecraftforge.fml.common.versioning.VersionRange restriction]
    (-> this (.restrict restriction))))

(defn unbounded-above?
  "returns: `boolean`"
  (^Boolean [^VersionRange this]
    (-> this (.isUnboundedAbove))))

(defn get-lower-bound-string
  "returns: `java.lang.String`"
  (^java.lang.String [^VersionRange this]
    (-> this (.getLowerBoundString))))

(defn contains-version
  "version - `net.minecraftforge.fml.common.versioning.ArtifactVersion`

  returns: `boolean`"
  (^Boolean [^VersionRange this ^net.minecraftforge.fml.common.versioning.ArtifactVersion version]
    (-> this (.containsVersion version))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^VersionRange this]
    (-> this (.toString))))

(defn get-restrictions
  "returns: `java.util.List<net.minecraftforge.fml.common.versioning.Restriction>`"
  (^java.util.List [^VersionRange this]
    (-> this (.getRestrictions))))

(defn has-restrictions?
  "returns: `boolean`"
  (^Boolean [^VersionRange this]
    (-> this (.hasRestrictions))))

(defn get-recommended-version
  "returns: `net.minecraftforge.fml.common.versioning.ArtifactVersion`"
  (^net.minecraftforge.fml.common.versioning.ArtifactVersion [^VersionRange this]
    (-> this (.getRecommendedVersion))))

(defn match-version
  "versions - `java.util.List`

  returns: `net.minecraftforge.fml.common.versioning.ArtifactVersion`"
  (^net.minecraftforge.fml.common.versioning.ArtifactVersion [^VersionRange this ^java.util.List versions]
    (-> this (.matchVersion versions))))

(defn to-string-friendly
  "returns: `java.lang.String`"
  (^java.lang.String [^VersionRange this]
    (-> this (.toStringFriendly))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VersionRange this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VersionRange this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn clone-of
  "returns: `net.minecraftforge.fml.common.versioning.VersionRange`"
  (^net.minecraftforge.fml.common.versioning.VersionRange [^VersionRange this]
    (-> this (.cloneOf))))

