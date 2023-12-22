<?php

namespace App\Observers;

use App\Models\ResourceFile;

class ResourceFileObserver
{
    /**
     * Handle the ResourceFile "created" event.
     */
    public function created(ResourceFile $resourceFile): void
    {
        //
    }

    /**
     * Handle the ResourceFile "updated" event.
     */
    public function updated(ResourceFile $resourceFile): void
    {
        //
    }

    /**
     * Handle the ResourceFile "deleted" event.
     */
    public function deleted(ResourceFile $resourceFile): void
    {
        //
    }

    /**
     * Handle the ResourceFile "restored" event.
     */
    public function restored(ResourceFile $resourceFile): void
    {
        //
    }

    /**
     * Handle the ResourceFile "force deleted" event.
     */
    public function forceDeleted(ResourceFile $resourceFile): void
    {
        //
    }
}
