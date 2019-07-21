(ns net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$MissingMapping
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.event FMLMissingMappingsEvent$MissingMapping]))

(defn ->missing-mapping
  "Constructor.

  type - `net.minecraftforge.fml.common.registry.GameRegistry$Type`
  name - `net.minecraft.util.ResourceLocation`
  id - `int`"
  (^FMLMissingMappingsEvent$MissingMapping [^net.minecraftforge.fml.common.registry.GameRegistry$Type type ^net.minecraft.util.ResourceLocation name ^Integer id]
    (new FMLMissingMappingsEvent$MissingMapping type name id)))

(defn type
  "Instance Constant.

  type: net.minecraftforge.fml.common.registry.GameRegistry$Type"
  (^net.minecraftforge.fml.common.registry.GameRegistry$Type [^FMLMissingMappingsEvent$MissingMapping this]
    (-> this .-type)))

(defn name
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^FMLMissingMappingsEvent$MissingMapping this]
    (-> this .-name)))

(defn id
  "Instance Constant.

  type: int"
  (^Integer [^FMLMissingMappingsEvent$MissingMapping this]
    (-> this .-id)))

(defn resource-location
  "Instance Constant.

  type: net.minecraft.util.ResourceLocation"
  (^net.minecraft.util.ResourceLocation [^FMLMissingMappingsEvent$MissingMapping this]
    (-> this .-resourceLocation)))

(defn ignore
  "Ignore the missing item."
  ([^FMLMissingMappingsEvent$MissingMapping this]
    (-> this (.ignore))))

(defn warn
  "Warn the user about the missing item."
  ([^FMLMissingMappingsEvent$MissingMapping this]
    (-> this (.warn))))

(defn fail
  "Prevent the world from loading due to the missing item."
  ([^FMLMissingMappingsEvent$MissingMapping this]
    (-> this (.fail))))

(defn remap
  "Remap the missing item to the specified Block.

   Use this if you have renamed a Block, don't forget to handle the ItemBlock.
   Existing references using the old name will point to the new one.

  target - Block to remap to. - `net.minecraft.block.Block`"
  ([^FMLMissingMappingsEvent$MissingMapping this ^net.minecraft.block.Block target]
    (-> this (.remap target))))

(defn skip-item-block
  ""
  ([^FMLMissingMappingsEvent$MissingMapping this]
    (-> this (.skipItemBlock))))

(defn get-action
  "returns: `net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$Action`"
  (^net.minecraftforge.fml.common.event.FMLMissingMappingsEvent$Action [^FMLMissingMappingsEvent$MissingMapping this]
    (-> this (.getAction))))

(defn get-target
  "returns: `java.lang.Object`"
  (^java.lang.Object [^FMLMissingMappingsEvent$MissingMapping this]
    (-> this (.getTarget))))

