(ns net.minecraftforge.fml.common.ModContainerFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common ModContainerFactory]))

(defn *-mod-types
  "Static Field.

  type: java.util.Map<org.objectweb.asm.Type,java.lang.reflect.Constructor<? extends net.minecraftforge.fml.common.ModContainer>>"
  []
  ModContainerFactory/modTypes)

(defn *instance
  "returns: `net.minecraftforge.fml.common.ModContainerFactory`"
  (^net.minecraftforge.fml.common.ModContainerFactory []
    (ModContainerFactory/instance )))

(defn register-container-type
  "type - `org.objectweb.asm.Type`
  container - `java.lang.Class`"
  ([^ModContainerFactory this ^org.objectweb.asm.Type type ^java.lang.Class container]
    (-> this (.registerContainerType type container))))

(defn build
  "mod-parser - `net.minecraftforge.fml.common.discovery.asm.ASMModParser`
  mod-source - `java.io.File`
  container - `net.minecraftforge.fml.common.discovery.ModCandidate`

  returns: `net.minecraftforge.fml.common.ModContainer`"
  (^net.minecraftforge.fml.common.ModContainer [^ModContainerFactory this ^net.minecraftforge.fml.common.discovery.asm.ASMModParser mod-parser ^java.io.File mod-source ^net.minecraftforge.fml.common.discovery.ModCandidate container]
    (-> this (.build mod-parser mod-source container))))

