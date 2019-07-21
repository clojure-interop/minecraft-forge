(ns net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionGuiHandler
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client IModGuiFactory$RuntimeOptionGuiHandler]))

(defn add-widgets
  "Deprecated.

  widget-list - `java.util.List`
  x - X - `int`
  y - Y - `int`
  w - width - `int`
  h - height - `int`"
  ([^IModGuiFactory$RuntimeOptionGuiHandler this ^java.util.List widget-list ^Integer x ^Integer y ^Integer w ^Integer h]
    (-> this (.addWidgets widget-list x y w h))))

(defn paint
  "Deprecated.

  x - X - `int`
  y - Y - `int`
  w - width - `int`
  h - height - `int`"
  ([^IModGuiFactory$RuntimeOptionGuiHandler this ^Integer x ^Integer y ^Integer w ^Integer h]
    (-> this (.paint x y w h))))

(defn action-callback
  "Deprecated.

  action-id - the actionId of the firing widget - `int`"
  ([^IModGuiFactory$RuntimeOptionGuiHandler this ^Integer action-id]
    (-> this (.actionCallback action-id))))

(defn close
  "Deprecated."
  ([^IModGuiFactory$RuntimeOptionGuiHandler this]
    (-> this (.close))))

