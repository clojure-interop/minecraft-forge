(ns net.minecraftforge.fml.client.registry.RenderingRegistry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.registry RenderingRegistry]))

(defn ->rendering-registry
  "Constructor."
  (^RenderingRegistry []
    (new RenderingRegistry )))

(defn *register-entity-rendering-handler
  "Register an entity rendering handler. This will, after mod initialization, be inserted into the main
   render map for entities.
   Call this during Preinitialization phase.

  entity-class - `java.lang.Class`
  render-factory - `net.minecraftforge.fml.client.registry.IRenderFactory`

  returns: `<T extends net.minecraft.entity.Entity> void`"
  ([^java.lang.Class entity-class ^net.minecraftforge.fml.client.registry.IRenderFactory render-factory]
    (RenderingRegistry/registerEntityRenderingHandler entity-class render-factory)))

(defn *load-entity-renderers
  "manager - `net.minecraft.client.renderer.entity.RenderManager`
  render-map - `java.util.Map`"
  ([^net.minecraft.client.renderer.entity.RenderManager manager ^java.util.Map render-map]
    (RenderingRegistry/loadEntityRenderers manager render-map))
  ([^java.util.Map entity-render-map]
    (RenderingRegistry/loadEntityRenderers entity-render-map)))

