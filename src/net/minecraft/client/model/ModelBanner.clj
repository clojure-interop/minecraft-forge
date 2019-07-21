(ns net.minecraft.client.model.ModelBanner
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelBanner]))

(defn ->model-banner
  "Constructor."
  (^ModelBanner []
    (new ModelBanner )))

(defn banner-slate
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelBanner this]
    (-> this .-bannerSlate)))

(defn banner-stand
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelBanner this]
    (-> this .-bannerStand)))

(defn banner-top
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelBanner this]
    (-> this .-bannerTop)))

(defn render-banner
  ""
  ([^ModelBanner this]
    (-> this (.renderBanner))))

