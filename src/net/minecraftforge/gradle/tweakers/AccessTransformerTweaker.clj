(ns net.minecraftforge.gradle.tweakers.AccessTransformerTweaker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.gradle.tweakers AccessTransformerTweaker]))

(defn ->access-transformer-tweaker
  "Constructor."
  (^AccessTransformerTweaker []
    (new AccessTransformerTweaker )))

(defn inject-into-class-loader
  "class-loader - `net.minecraft.launchwrapper.LaunchClassLoader`"
  ([^AccessTransformerTweaker this ^net.minecraft.launchwrapper.LaunchClassLoader class-loader]
    (-> this (.injectIntoClassLoader class-loader))))

(defn accept-options
  "args - `java.util.List`
  game-dir - `java.io.File`
  assets-dir - `java.io.File`
  profile - `java.lang.String`"
  ([^AccessTransformerTweaker this ^java.util.List args ^java.io.File game-dir ^java.io.File assets-dir ^java.lang.String profile]
    (-> this (.acceptOptions args game-dir assets-dir profile))))

(defn get-launch-target
  "returns: `java.lang.String`"
  (^java.lang.String [^AccessTransformerTweaker this]
    (-> this (.getLaunchTarget))))

(defn get-launch-arguments
  "returns: `java.lang.String[]`"
  ([^AccessTransformerTweaker this]
    (-> this (.getLaunchArguments))))

