(ns net.minecraftforge.fml.relauncher.CoreModManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher CoreModManager]))

(defn ->core-mod-manager
  "Constructor."
  (^CoreModManager []
    (new CoreModManager )))

(defn *get-reparseable-coremods
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (CoreModManager/getReparseableCoremods )))

(defn *on-crash
  "builder - `java.lang.StringBuilder`"
  ([^java.lang.StringBuilder builder]
    (CoreModManager/onCrash builder)))

(defn *get-ignored-mods
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (CoreModManager/getIgnoredMods )))

(defn *sort-tweak-list
  ""
  ([]
    (CoreModManager/sortTweakList )))

(defn *get-access-transformers
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (CoreModManager/getAccessTransformers )))

(defn *inject-transformers
  "class-loader - `net.minecraft.launchwrapper.LaunchClassLoader`"
  ([^net.minecraft.launchwrapper.LaunchClassLoader class-loader]
    (CoreModManager/injectTransformers class-loader)))

(defn *inject-core-mod-tweaks
  "fml-injection-and-sorting-tweaker - `net.minecraftforge.fml.common.launcher.FMLInjectionAndSortingTweaker`"
  ([^net.minecraftforge.fml.common.launcher.FMLInjectionAndSortingTweaker fml-injection-and-sorting-tweaker]
    (CoreModManager/injectCoreModTweaks fml-injection-and-sorting-tweaker)))

(defn *get-transformers
  "returns: `java.util.Map<java.lang.String,java.util.List<java.lang.String>>`"
  (^java.util.Map []
    (CoreModManager/getTransformers )))

(defn *handle-launch
  "mc-dir - `java.io.File`
  class-loader - `net.minecraft.launchwrapper.LaunchClassLoader`
  tweaker - `net.minecraftforge.fml.common.launcher.FMLTweaker`"
  ([^java.io.File mc-dir ^net.minecraft.launchwrapper.LaunchClassLoader class-loader ^net.minecraftforge.fml.common.launcher.FMLTweaker tweaker]
    (CoreModManager/handleLaunch mc-dir class-loader tweaker)))

