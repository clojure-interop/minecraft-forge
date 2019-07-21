(ns net.minecraftforge.fml.common.launcher.FMLDeobfTweaker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.launcher FMLDeobfTweaker]))

(defn ->fml-deobf-tweaker
  "Constructor."
  (^FMLDeobfTweaker []
    (new FMLDeobfTweaker )))

(defn accept-options
  "args - `java.util.List`
  game-dir - `java.io.File`
  assets-dir - `java.io.File`
  profile - `java.lang.String`"
  ([^FMLDeobfTweaker this ^java.util.List args ^java.io.File game-dir ^java.io.File assets-dir ^java.lang.String profile]
    (-> this (.acceptOptions args game-dir assets-dir profile))))

(defn inject-into-class-loader
  "class-loader - `net.minecraft.launchwrapper.LaunchClassLoader`"
  ([^FMLDeobfTweaker this ^net.minecraft.launchwrapper.LaunchClassLoader class-loader]
    (-> this (.injectIntoClassLoader class-loader))))

(defn get-launch-target
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLDeobfTweaker this]
    (-> this (.getLaunchTarget))))

(defn get-launch-arguments
  "returns: `java.lang.String[]`"
  ([^FMLDeobfTweaker this]
    (-> this (.getLaunchArguments))))

