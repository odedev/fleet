<?php

namespace App\Observers;

use App\Models\ViewBlock;

class ViewBlockObserver
{
    /**
     * Handle the ViewBlock "created" event.
     */
    public function created(ViewBlock $viewBlock): void
    {
        //
    }

    /**
     * Handle the ViewBlock "updated" event.
     */
    public function updated(ViewBlock $viewBlock): void
    {
        //
    }

    /**
     * Handle the ViewBlock "deleted" event.
     */
    public function deleted(ViewBlock $viewBlock): void
    {
        //
    }

    /**
     * Handle the ViewBlock "restored" event.
     */
    public function restored(ViewBlock $viewBlock): void
    {
        //
    }

    /**
     * Handle the ViewBlock "force deleted" event.
     */
    public function forceDeleted(ViewBlock $viewBlock): void
    {
        //
    }
}
