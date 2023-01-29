package com.mgtv.baseLib.image.base;

public class ImageLoaderConfig {
    private IImageLoaderStrategy imageLoaderStrategy;
    private long maxMemory = 0;

    private ImageLoaderConfig(Builder builder) {
        imageLoaderStrategy = builder.imageLoaderStrategy;
        maxMemory = builder.maxMemory;
    }

    public long getMaxMemory() {
        return maxMemory <= 0 ? 40 * 1024 * 1024 : maxMemory;
    }

    public IImageLoaderStrategy getIImageLoaderStrategy() {
        return imageLoaderStrategy;
    }

    public static class Builder {
        private IImageLoaderStrategy imageLoaderStrategy;
        private long maxMemory = 40 * 1024 * 1024;

        public Builder(IImageLoaderStrategy loaderStrategy) {
            imageLoaderStrategy = loaderStrategy;
        }

        /**
         * @param maxMemory 单位为 Byte
         * @return
         */
        public Builder maxMemory(Long maxMemory) {
            this.maxMemory = maxMemory;
            return this;
        }

        public ImageLoaderConfig build() {
            return new ImageLoaderConfig(this);
        }
    }
}
