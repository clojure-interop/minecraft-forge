(ns net.minecraftforge.fml.common.patcher.ClassPatchManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.patcher ClassPatchManager]))

(def *-instance
  "Static Constant.

  type: net.minecraftforge.fml.common.patcher.ClassPatchManager"
  ClassPatchManager/INSTANCE)

(def *-dump-patched
  "Static Constant.

  type: boolean"
  ClassPatchManager/dumpPatched)

(def *-debug
  "Static Constant.

  type: boolean"
  ClassPatchManager/DEBUG)

(defn get-patched-resource
  "name - `java.lang.String`
  mapped-name - `java.lang.String`
  loader - `net.minecraft.launchwrapper.LaunchClassLoader`

  returns: `byte[]`

  throws: java.io.IOException"
  ([^ClassPatchManager this ^java.lang.String name ^java.lang.String mapped-name ^net.minecraft.launchwrapper.LaunchClassLoader loader]
    (-> this (.getPatchedResource name mapped-name loader))))

(defn apply-patch
  "name - `java.lang.String`
  mapped-name - `java.lang.String`
  input-data - `byte[]`

  returns: `byte[]`"
  ([^ClassPatchManager this ^java.lang.String name ^java.lang.String mapped-name input-data]
    (-> this (.applyPatch name mapped-name input-data))))

(defn setup
  "side - `net.minecraftforge.fml.relauncher.Side`"
  ([^ClassPatchManager this ^net.minecraftforge.fml.relauncher.Side side]
    (-> this (.setup side))))

