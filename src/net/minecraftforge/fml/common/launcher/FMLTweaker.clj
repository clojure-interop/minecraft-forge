(ns net.minecraftforge.fml.common.launcher.FMLTweaker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.launcher FMLTweaker]))

(defn ->fml-tweaker
  "Constructor."
  (^FMLTweaker []
    (new FMLTweaker )))

(defn *get-jar-location
  "returns: `java.net.URI`"
  (^java.net.URI []
    (FMLTweaker/getJarLocation )))

(defn accept-options
  "args - `java.util.List`
  game-dir - `java.io.File`
  assets-dir - `java.io.File`
  profile - `java.lang.String`"
  ([^FMLTweaker this ^java.util.List args ^java.io.File game-dir ^java.io.File assets-dir ^java.lang.String profile]
    (-> this (.acceptOptions args game-dir assets-dir profile))))

(defn inject-into-class-loader
  "class-loader - `net.minecraft.launchwrapper.LaunchClassLoader`"
  ([^FMLTweaker this ^net.minecraft.launchwrapper.LaunchClassLoader class-loader]
    (-> this (.injectIntoClassLoader class-loader))))

(defn get-launch-target
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLTweaker this]
    (-> this (.getLaunchTarget))))

(defn get-launch-arguments
  "returns: `java.lang.String[]`"
  ([^FMLTweaker this]
    (-> this (.getLaunchArguments))))

(defn get-game-dir
  "returns: `java.io.File`"
  (^java.io.File [^FMLTweaker this]
    (-> this (.getGameDir))))

(defn inject-cascading-tweak
  "tweak-class-name - `java.lang.String`"
  ([^FMLTweaker this ^java.lang.String tweak-class-name]
    (-> this (.injectCascadingTweak tweak-class-name))))

