(ns net.minecraftforge.fml.common.launcher.FMLServerTweaker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.launcher FMLServerTweaker]))

(defn ->fml-server-tweaker
  "Constructor."
  (^FMLServerTweaker []
    (new FMLServerTweaker )))

(defn accept-options
  "args - `java.util.List`
  game-dir - `java.io.File`
  assets-dir - `java.io.File`
  profile - `java.lang.String`"
  ([^FMLServerTweaker this ^java.util.List args ^java.io.File game-dir ^java.io.File assets-dir ^java.lang.String profile]
    (-> this (.acceptOptions args game-dir assets-dir profile))))

(defn get-launch-target
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLServerTweaker this]
    (-> this (.getLaunchTarget))))

(defn inject-into-class-loader
  "class-loader - `net.minecraft.launchwrapper.LaunchClassLoader`"
  ([^FMLServerTweaker this ^net.minecraft.launchwrapper.LaunchClassLoader class-loader]
    (-> this (.injectIntoClassLoader class-loader))))

