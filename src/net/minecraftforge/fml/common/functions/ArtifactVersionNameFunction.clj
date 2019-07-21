(ns net.minecraftforge.fml.common.functions.ArtifactVersionNameFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.functions ArtifactVersionNameFunction]))

(defn ->artifact-version-name-function
  "Constructor."
  (^ArtifactVersionNameFunction []
    (new ArtifactVersionNameFunction )))

(defn apply
  "v - `net.minecraftforge.fml.common.versioning.ArtifactVersion`

  returns: `java.lang.String`"
  (^java.lang.String [^ArtifactVersionNameFunction this ^net.minecraftforge.fml.common.versioning.ArtifactVersion v]
    (-> this (.apply v))))

