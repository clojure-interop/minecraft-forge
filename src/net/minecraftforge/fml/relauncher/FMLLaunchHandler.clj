(ns net.minecraftforge.fml.relauncher.FMLLaunchHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher FMLLaunchHandler]))

(defn *configure-for-client-launch
  "loader - `net.minecraft.launchwrapper.LaunchClassLoader`
  tweaker - `net.minecraftforge.fml.common.launcher.FMLTweaker`"
  ([^net.minecraft.launchwrapper.LaunchClassLoader loader ^net.minecraftforge.fml.common.launcher.FMLTweaker tweaker]
    (FMLLaunchHandler/configureForClientLaunch loader tweaker)))

(defn *configure-for-server-launch
  "loader - `net.minecraft.launchwrapper.LaunchClassLoader`
  tweaker - `net.minecraftforge.fml.common.launcher.FMLTweaker`"
  ([^net.minecraft.launchwrapper.LaunchClassLoader loader ^net.minecraftforge.fml.common.launcher.FMLTweaker tweaker]
    (FMLLaunchHandler/configureForServerLaunch loader tweaker)))

(defn *side
  "returns: `net.minecraftforge.fml.relauncher.Side`"
  (^net.minecraftforge.fml.relauncher.Side []
    (FMLLaunchHandler/side )))

(defn *append-core-mods
  ""
  ([]
    (FMLLaunchHandler/appendCoreMods )))

