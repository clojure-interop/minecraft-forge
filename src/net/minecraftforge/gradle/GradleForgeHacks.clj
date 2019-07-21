(ns net.minecraftforge.gradle.GradleForgeHacks
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.gradle GradleForgeHacks]))

(defn ->gradle-forge-hacks
  "Constructor."
  (^GradleForgeHacks []
    (new GradleForgeHacks )))

(def *-core-map
  "Static Constant.

  type: java.util.Map<java.lang.String,java.io.File>"
  GradleForgeHacks/coreMap)

(defn *search-coremods
  "common - `net.minecraftforge.gradle.GradleStartCommon`

  throws: java.lang.Exception"
  ([^net.minecraftforge.gradle.GradleStartCommon common]
    (GradleForgeHacks/searchCoremods common)))

