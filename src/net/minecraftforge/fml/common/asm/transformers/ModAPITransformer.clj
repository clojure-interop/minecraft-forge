(ns net.minecraftforge.fml.common.asm.transformers.ModAPITransformer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.asm.transformers ModAPITransformer]))

(defn ->mod-api-transformer
  "Constructor."
  (^ModAPITransformer []
    (new ModAPITransformer )))

(defn transform
  "name - `java.lang.String`
  transformed-name - `java.lang.String`
  basic-class - `byte[]`

  returns: `byte[]`"
  ([^ModAPITransformer this ^java.lang.String name ^java.lang.String transformed-name basic-class]
    (-> this (.transform name transformed-name basic-class))))

(defn init-table
  "data-table - `net.minecraftforge.fml.common.discovery.ASMDataTable`"
  ([^ModAPITransformer this ^net.minecraftforge.fml.common.discovery.ASMDataTable data-table]
    (-> this (.initTable data-table))))

