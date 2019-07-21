(ns net.minecraftforge.fml.common.launcher.FMLInjectionAndSortingTweaker
  "This class is to manage the injection of coremods as tweakers into the tweak framework.
  It has to inject the coremod tweaks during construction, because that is the only time
  the tweak list is writeable."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.launcher FMLInjectionAndSortingTweaker]))

(defn ->fml-injection-and-sorting-tweaker
  "Constructor."
  (^FMLInjectionAndSortingTweaker []
    (new FMLInjectionAndSortingTweaker )))

(defn accept-options
  "args - `java.util.List`
  game-dir - `java.io.File`
  assets-dir - `java.io.File`
  profile - `java.lang.String`"
  ([^FMLInjectionAndSortingTweaker this ^java.util.List args ^java.io.File game-dir ^java.io.File assets-dir ^java.lang.String profile]
    (-> this (.acceptOptions args game-dir assets-dir profile))))

(defn inject-into-class-loader
  "class-loader - `net.minecraft.launchwrapper.LaunchClassLoader`"
  ([^FMLInjectionAndSortingTweaker this ^net.minecraft.launchwrapper.LaunchClassLoader class-loader]
    (-> this (.injectIntoClassLoader class-loader))))

(defn get-launch-target
  "returns: `java.lang.String`"
  (^java.lang.String [^FMLInjectionAndSortingTweaker this]
    (-> this (.getLaunchTarget))))

(defn get-launch-arguments
  "returns: `java.lang.String[]`"
  ([^FMLInjectionAndSortingTweaker this]
    (-> this (.getLaunchArguments))))

