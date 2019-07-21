(ns net.minecraftforge.fml.common.registry.IForgeRegistry$AddCallback
  "Callback fired when objects are added to the registry. This will fire when the registry is rebuilt
  on the client side from a server side synchronization, or when a world is loaded."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry IForgeRegistry$AddCallback]))

(defn on-add
  "obj - `V`
  id - `int`
  slaveset - `java.util.Map`"
  ([^IForgeRegistry$AddCallback this obj ^Integer id ^java.util.Map slaveset]
    (-> this (.onAdd obj id slaveset))))

