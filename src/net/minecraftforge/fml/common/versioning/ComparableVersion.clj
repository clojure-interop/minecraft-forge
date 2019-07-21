(ns net.minecraftforge.fml.common.versioning.ComparableVersion
  "Generic implementation of version comparison.

  Features:

  mixing of '-' (dash) and '.' (dot) separators,
  transition between characters and digits also constitutes a separator:
      1.0alpha1 => [1, 0, alpha, 1]
  unlimited number of version components,
  version components in the text can be digits or strings,
  strings are checked for well-known qualifiers and the qualifier ordering is used for version ordering.
      Well-known qualifiers (case insensitive) are:
      snapshot
      alpha or a
      beta or b
      milestone or m
      rc or cr
      (the empty string) or ga or final
      sp

      Unknown qualifiers are considered after known qualifiers, with lexical order (always case insensitive),

  a dash usually precedes a qualifier, and is always less important than something preceded with a dot."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.versioning ComparableVersion]))

(defn ->comparable-version
  "Constructor.

  version - `java.lang.String`"
  (^ComparableVersion [^java.lang.String version]
    (new ComparableVersion version)))

(defn parse-version
  "version - `java.lang.String`"
  ([^ComparableVersion this ^java.lang.String version]
    (-> this (.parseVersion version))))

(defn compare-to
  "o - `net.minecraftforge.fml.common.versioning.ComparableVersion`

  returns: `int`"
  (^Integer [^ComparableVersion this ^net.minecraftforge.fml.common.versioning.ComparableVersion o]
    (-> this (.compareTo o))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ComparableVersion this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ComparableVersion this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ComparableVersion this]
    (-> this (.hashCode))))

