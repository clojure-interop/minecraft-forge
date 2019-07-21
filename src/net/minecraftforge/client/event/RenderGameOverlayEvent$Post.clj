(ns net.minecraftforge.client.event.RenderGameOverlayEvent$Post
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderGameOverlayEvent$Post]))

(defn ->post
  "Constructor.

  parent - `net.minecraftforge.client.event.RenderGameOverlayEvent`
  type - `net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType`"
  (^RenderGameOverlayEvent$Post [^net.minecraftforge.client.event.RenderGameOverlayEvent parent ^net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType type]
    (new RenderGameOverlayEvent$Post parent type)))

(defn cancelable?
  "Description copied from class: Event

  returns: If access to setCanceled should be allowed

   Note:
   Events with the Cancelable annotation will have this method automatically added to return true. - `boolean`"
  (^Boolean [^RenderGameOverlayEvent$Post this]
    (-> this (.isCancelable))))

