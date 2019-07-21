(ns net.minecraftforge.fml.common.versioning.InvalidVersionSpecificationException
  "Occurs when a version is invalid."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.versioning InvalidVersionSpecificationException]))

(defn ->invalid-version-specification-exception
  "Constructor.

  message - `java.lang.String`"
  (^InvalidVersionSpecificationException [^java.lang.String message]
    (new InvalidVersionSpecificationException message)))

