(ns net.minecraftforge.fml.common.registry.IForgeRegistry$SubstitutionCallback
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry IForgeRegistry$SubstitutionCallback]))

(defn on-substitute-activated
  "slaveset - `java.util.Map`
  original - `V`
  replacement - `V`
  name - `net.minecraft.util.ResourceLocation`"
  ([^IForgeRegistry$SubstitutionCallback this ^java.util.Map slaveset original replacement ^net.minecraft.util.ResourceLocation name]
    (-> this (.onSubstituteActivated slaveset original replacement name))))

