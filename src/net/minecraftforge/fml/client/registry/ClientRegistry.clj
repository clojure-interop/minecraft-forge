(ns net.minecraftforge.fml.client.registry.ClientRegistry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.registry ClientRegistry]))

(defn ->client-registry
  "Constructor."
  (^ClientRegistry []
    (new ClientRegistry )))

(defn *register-tile-entity
  "Utility method for registering a tile entity and it's renderer at once - generally you should register them separately

  tile-entity-class - `java.lang.Class`
  id - `java.lang.String`
  special-renderer - `net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer`

  returns: `<T extends net.minecraft.tileentity.TileEntity> void`"
  ([^java.lang.Class tile-entity-class ^java.lang.String id ^net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer special-renderer]
    (ClientRegistry/registerTileEntity tile-entity-class id special-renderer)))

(defn *bind-tile-entity-special-renderer
  "tile-entity-class - `java.lang.Class`
  special-renderer - `net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer`

  returns: `<T extends net.minecraft.tileentity.TileEntity> void`"
  ([^java.lang.Class tile-entity-class ^net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer special-renderer]
    (ClientRegistry/bindTileEntitySpecialRenderer tile-entity-class special-renderer)))

(defn *register-key-binding
  "key - `net.minecraft.client.settings.KeyBinding`"
  ([^net.minecraft.client.settings.KeyBinding key]
    (ClientRegistry/registerKeyBinding key)))

(defn *register-entity-shader
  "Register a shader for an entity. This shader gets activated when a spectator begins spectating an entity.
   Vanilla examples of this are the green effect for creepers and the invert effect for endermen.

  entity-class - `java.lang.Class`
  shader - `net.minecraft.util.ResourceLocation`"
  ([^java.lang.Class entity-class ^net.minecraft.util.ResourceLocation shader]
    (ClientRegistry/registerEntityShader entity-class shader)))

(defn *get-entity-shader
  "entity-class - `java.lang.Class`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^java.lang.Class entity-class]
    (ClientRegistry/getEntityShader entity-class)))

