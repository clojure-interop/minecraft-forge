(ns net.minecraftforge.gradle.tweakers.CoremodTweaker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.gradle.tweakers CoremodTweaker]))

(defn ->coremod-tweaker
  "Constructor."
  (^CoremodTweaker []
    (new CoremodTweaker )))

(defn inject-into-class-loader
  "class-loader - `net.minecraft.launchwrapper.LaunchClassLoader`"
  ([^CoremodTweaker this ^net.minecraft.launchwrapper.LaunchClassLoader class-loader]
    (-> this (.injectIntoClassLoader class-loader))))

(defn get-launch-target
  "returns: `java.lang.String`"
  (^java.lang.String [^CoremodTweaker this]
    (-> this (.getLaunchTarget))))

(defn get-launch-arguments
  "returns: `java.lang.String[]`"
  ([^CoremodTweaker this]
    (-> this (.getLaunchArguments))))

(defn accept-options
  "args - `java.util.List`
  game-dir - `java.io.File`
  assets-dir - `java.io.File`
  profile - `java.lang.String`"
  ([^CoremodTweaker this ^java.util.List args ^java.io.File game-dir ^java.io.File assets-dir ^java.lang.String profile]
    (-> this (.acceptOptions args game-dir assets-dir profile))))

