(ns net.minecraftforge.fml.common.asm.ASMTransformerWrapper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm ASMTransformerWrapper]))

(defn ->asm-transformer-wrapper
  "Constructor."
  (^ASMTransformerWrapper []
    (new ASMTransformerWrapper )))

(defn *get-transformer-wrapper
  "launch-loader - `net.minecraft.launchwrapper.LaunchClassLoader`
  parent-class - `java.lang.String`
  core-mod - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraft.launchwrapper.LaunchClassLoader launch-loader ^java.lang.String parent-class ^java.lang.String core-mod]
    (ASMTransformerWrapper/getTransformerWrapper launch-loader parent-class core-mod)))

