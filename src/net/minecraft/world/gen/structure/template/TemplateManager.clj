(ns net.minecraft.world.gen.structure.template.TemplateManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure.template TemplateManager]))

(defn ->template-manager
  "Constructor.

  p-i-47239-1 - `java.lang.String`
  p-i-47239-2 - `net.minecraft.util.datafix.DataFixer`"
  (^TemplateManager [^java.lang.String p-i-47239-1 ^net.minecraft.util.datafix.DataFixer p-i-47239-2]
    (new TemplateManager p-i-47239-1 p-i-47239-2)))

(defn get-template
  "server - `net.minecraft.server.MinecraftServer`
  id - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraft.world.gen.structure.template.Template`"
  (^net.minecraft.world.gen.structure.template.Template [^TemplateManager this ^net.minecraft.server.MinecraftServer server ^net.minecraft.util.ResourceLocation id]
    (-> this (.getTemplate server id))))

(defn get
  "p-189942-1 - `net.minecraft.server.MinecraftServer`
  p-189942-2 - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraft.world.gen.structure.template.Template`"
  (^net.minecraft.world.gen.structure.template.Template [^TemplateManager this ^net.minecraft.server.MinecraftServer p-189942-1 ^net.minecraft.util.ResourceLocation p-189942-2]
    (-> this (.get p-189942-1 p-189942-2))))

(defn read-template
  "server - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^TemplateManager this ^net.minecraft.util.ResourceLocation server]
    (-> this (.readTemplate server))))

(defn write-template
  "server - `net.minecraft.server.MinecraftServer`
  id - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^TemplateManager this ^net.minecraft.server.MinecraftServer server ^net.minecraft.util.ResourceLocation id]
    (-> this (.writeTemplate server id))))

(defn remove
  "p-189941-1 - `net.minecraft.util.ResourceLocation`"
  ([^TemplateManager this ^net.minecraft.util.ResourceLocation p-189941-1]
    (-> this (.remove p-189941-1))))

