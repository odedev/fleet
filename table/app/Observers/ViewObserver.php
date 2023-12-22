<?php

namespace App\Observers;

use App\Models\View;

class ViewObserver
{
    /**
     * Handle the View "created" event.
     */
    public function created(View $view): void
    {
        //
    }

    /**
     * Handle the View "updated" event.
     */
    public function updated(View $view): void
    {
        //
    }

    /**
     * Handle the View "deleted" event.
     */
    public function deleted(View $view): void
    {
        //
    }

    /**
     * Handle the View "restored" event.
     */
    public function restored(View $view): void
    {
        //
    }

    /**
     * Handle the View "force deleted" event.
     */
    public function forceDeleted(View $view): void
    {
        //
    }
}
