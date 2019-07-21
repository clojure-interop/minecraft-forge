(ns net.minecraft.client.model.ModelPig
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelPig]))

(defn ->model-pig
  "Constructor.

  scale - `float`"
  (^ModelPig [^Float scale]
    (new ModelPig scale))
  (^ModelPig []
    (new ModelPig )))

